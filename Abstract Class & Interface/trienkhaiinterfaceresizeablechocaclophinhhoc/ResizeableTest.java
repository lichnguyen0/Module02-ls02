package trienkhaiinterfaceresizeablechocaclophinhhoc;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
Shape[] shapes = new Shape[3];
shapes[0] = new Circle(5);
shapes[1] = new Rectangle(4, 6);
shapes[2] = new Square(3);

        Random rand = new Random();

        for (Shape shape : shapes) {
            double before = shape.getArea();
            double percent = rand.nextInt(100) + 1; // 1 - 100
            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }
            double after = shape.getArea();

            System.out.println("Hình: " + shape.getClass().getSimpleName());
            System.out.println("Diện tích trước: " + before);
            System.out.println("Tăng kích thước " + percent + "%");
            System.out.println("Diện tích sau: " + after);
            System.out.println("----------------------");
        }
    }
}
