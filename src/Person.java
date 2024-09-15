import java.util.Objects;
import java.util.*;

public class Person {

    private String fName;
    private String lName;
    private int ID;
    private String title;
    private int YOB;

    /**
     *
     * @param fName
     * @param lName
     * @param ID
     * @param title
     * @param YOB
     */

    public Person(String fName, String lName, int ID, String title, int YOB) {
        this.fName = fName;
        this.lName = lName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName() {
            return fName + " " + lName;
        }

        public String formalName() {
            return title + " " + fullName();
        }

        public String getAge() {
            int currentAge1;
            currentAge1 = 2024 - YOB;

            return Integer.toString(currentAge1);
        }

        public String getAge(int year) {
            Calendar cal = Calendar.getInstance();
            int currentAge2;
            year = cal.get(Calendar.YEAR);
            currentAge2 = year - YOB;

            return Integer.toString(currentAge2);
        }

        public String toCSV() {
            final char DQ = '"';
            return DQ + fName + DQ + ", " + DQ + lName + DQ + ", " + DQ + ID + DQ + ", " + DQ + title + DQ + ", " + YOB;
    }

    public String toJSON() {
        final char DQ = '"';
        String retString = "";
        retString = "{" + DQ + "IDNum" + DQ + ":" + ID + DQ + this.getID() + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + ID + DQ + this.getfName() + DQ + ",";
        retString += DQ + "lastName" + DQ + ":" + ID + DQ + this.getlName() + DQ + ",";
        retString += DQ + "Title" + DQ + ":" + ID + DQ + this.getTitle() + DQ + ",";
        retString += DQ + "YOB" + DQ + ":" + ID + DQ + this.getYOB() + DQ + ",";
        return retString;
    }

    public String toXML() {
        final char DQ = '"';
        String retString = "";
        retString = "<Person>" + "<IDNum>" + this.getID() + "</IDNum>";
        retString += "<firstName>" + this.getfName() + "</firstName>";
        retString += "<lastName>" + this.getlName() + "</lastName>";
        retString += "<title>" + this.getTitle() + "</title>";
        retString += "<YOB>" + this.getYOB() + "</YOB>";
        return retString;
    }
}