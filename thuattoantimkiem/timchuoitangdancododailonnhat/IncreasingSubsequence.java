package timchuoitangdancododailonnhat;

import java.util.Scanner;

public class IncreasingSubsequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một từ: ");
        String input = sc.nextLine();

        String longest = "";
        String current = "";

        current += input.charAt(0);
        longest = current;

        for (int i = 1; i < input.length(); i++) {
            char prev = current.charAt(current.length() - 1);
            char curr = input.charAt(i);

            if (curr > prev) {
                current += curr;
            } else {
                current = "" + curr;
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println("Chuỗi tăng dần là :" + longest);
    }
}
