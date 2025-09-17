package loppointvamoveablepoint;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        System.out.println("Point p1: "+p1);

        MovablePoint mp2 = new MovablePoint(2,3,2,4);
        System.out.println("MovablePoint mp2: "+mp2);

        //di chuyển mp2
        mp2.move();
        System.out.println("After moving: "+mp2);

        //di chuyển lần nữa
        mp2.move();
        System.out.println("After moving again: "+mp2);

    }
}
