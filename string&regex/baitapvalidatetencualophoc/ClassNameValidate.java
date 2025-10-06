package baitapvalidatetencualophoc;

import java.util.regex.Pattern;

public class ClassNameValidate {

    public static boolean isValidClassName(String className) {
        String regex = "^[CAP][0-9]{4}[GHK]$";
        return Pattern.matches(regex, className);
    }

    public static void main(String[] args) {
        String[] testNames = {"C0223G", "A0323K", "M0318G", "P0323A"};
        for (String name : testNames) {
            System.out.println(name + " -- " + isValidClassName(name));
        }
    }
}
