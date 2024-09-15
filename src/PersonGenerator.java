import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        SafeInputObj sInput = new SafeInputObj();

        ArrayList<String> recs = new ArrayList<>();

        ArrayList<Person> persons = new ArrayList<>();

        boolean doneInput = false;
        int ID;
        String fName = "";
        String lName = "";
        String title = "";
        String rec = "";
        int yob = 0;

        /*
        a.	ID (a String)
        b.	FirstName
        c.	LastName
        d.	Title (a string like Mr., Mrs., Ms., Dr., etc.)
        e.	YearOfBirth (an int)
        */

        do {
            ID = sInput.getInt("Enter your ID (ex. 000001)");
            fName = sInput.getNonZeroLenString("Enter your first name");
            lName = sInput.getNonZeroLenString("Enter your last name");
            title = sInput.getNonZeroLenString("Enter your title");
            yob = sInput.getRangedInt("Enter your year of birth", 1940, 2010);

            Person p = new Person(fName,  lName, ID, title,  yob);

            persons.add(p);

            rec = ID + ", " + fName + ", " + lName + ", " + title + ", " + yob;

            System.out.println(rec);

            recs.add(rec);

            System.out.println(recs);

            doneInput = sInput.getYNConfirm("Add more records?");

        } while (!doneInput);


        // uses a fixed known path:
        //  Path file = Paths.get("c:\\My Documents\\data.txt");

        // use the toolkit to get the current working directory of the IDE
        // will create the file within the Netbeans project src folder
        // (may need to adjust for other IDE)
        // Not sure if the toolkit is thread safe...
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "/src/PersonData.txt");

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(String r : recs)
            {
                writer.write(r, 0, r.length());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}

