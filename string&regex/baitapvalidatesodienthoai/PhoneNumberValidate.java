package baitapvalidatesodienthoai;

import java.util.regex.Pattern;

public class PhoneNumberValidate {
    public static boolean isValidPhone(String phone) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return Pattern.matches(regex, phone);
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(98)-(0866730514)"};
        for (String phone : phoneNumbers) {
            System.out.println(phone + " --- " + isValidPhone(phone));
        }
    }
}
