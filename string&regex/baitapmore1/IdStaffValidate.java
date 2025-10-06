package baitapmore1;

/*Bài 1: Kiểm tra mã nhân viên
Yêu cầu:
Mã nhân viên có dạng: NV-xxxx
Trong đó xxxx là 4 chữ số.
Ví dụ hợp lệ: NV-1234, NV-0001
Ví dụ không hợp lệ: NV1234, nv-1234, NV-12A4*/

import java.util.regex.Pattern;

public class IdStaffValidate {
    public static boolean isValidatStaff(String Staff) {
        String regex = "^NV-\\d{4}";
        return Pattern.matches(regex, Staff);
    }

    public static void main(String[] args) {
        String[] id = {
                "NV-1234",
                "NV-0001",
                "NV1234",
                "nv-1234",
                "NV-12A4",
        };
        for (String s : id) {
            System.out.println(s + " --- " + isValidatStaff(s));
        }
    }
}

