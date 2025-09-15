package xaydunglopquadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.println("Nhập cạnh b: ");
        double b = sc.nextDouble();

        System.out.println("Nhập cạnh c: ");
        double c = sc.nextDouble();


        //tao doi tuong
        Quadraticequation q = new Quadraticequation(a, b, c);

        double delta = q.getDisCriminant();

        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x1 = " + q.getRoot1());
            System.out.println("x2 = " + q.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: ");
            System.out.println("x1 = " + q.getRoot1());
        } else {
            System.out.println("The equation has no Root");
        }
    }
}
