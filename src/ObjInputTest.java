import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ObjInputTest {
    public static void main(String[] args) {
        SafeInputObj sInput = new SafeInputObj();

        String t1 = sInput.getNonZeroLenString("Test");
        System.out.println("Input: " + t1);

        int t2 = sInput.getInt("Test");
        System.out.println("Input: " + t2);

        int t3 = sInput.getRangedInt("Test", 1, 10);
        System.out.println("Input: " + t3);

        double t4 = sInput.getDouble("Test");
        System.out.println("Input: " + t4);

        double t5 = sInput.getRangedDouble("Test", 1.8, 10.2);
        System.out.println("Input: " + t5);

        boolean t6 = sInput.getYNConfirm("Test");
        System.out.println("Input: " + t6);

        String t7 = sInput.getRegExString("Test", "\\d\\sa+");
        System.out.println("Input: " + t7);
    }
}
