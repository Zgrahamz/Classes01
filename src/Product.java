import java.util.Objects;
import java.util.*;

public class Product {

    private String fName;
    private String lName;
    private String ID;
    private double YOB;

    /**
     *
     * @param fName
     * @param lName
     * @param ID
     * @param YOB
     */

    public Product(String fName, String lName, String ID, double YOB) {
        this.fName = fName;
        this.lName = lName;
        this.ID = ID;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }


    public String toCSV() {
        final char DQ = '\"';
        return DQ + fName + DQ + ", " + DQ + lName + DQ + ", " + DQ + ID + DQ + " , " + YOB;
    }

    public String toJSON() {
        final char DQ = '"';
        String retString = "";
        retString = "{" + DQ + "IDNum" + DQ + ":" + ID + DQ + this.getID() + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + ID + DQ + this.getfName() + DQ + ",";
        retString += DQ + "lastName" + DQ + ":" + ID + DQ + this.getlName() + DQ + ",";
        retString += DQ + "YOB" + DQ + ":" + ID + DQ + this.getYOB() + DQ + ",";
        return retString;
    }

    public String toXML() {
        final char DQ = '"';
        String retString = "";
        retString = "<Person>" + "<IDNum>" + this.getID() + "</IDNum>";
        retString += "<firstName>" + this.getfName() + "</firstName>";
        retString += "<lastName>" + this.getlName() + "</lastName>";
        retString += "<YOB>" + this.getYOB() + "</YOB>";
        return retString;
    }
}
