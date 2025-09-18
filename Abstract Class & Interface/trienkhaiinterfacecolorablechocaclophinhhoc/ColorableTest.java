package trienkhaiinterfacecolorablechocaclophinhhoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(7); //

        for (Shape shape : shapes) {
            System.out.println("Hình: " + shape.getClass().getSimpleName());
            System.out.println("Diện tích: " + shape.getArea());

            // nếu hình đó là Colorable thì gọi howToColor()
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println("--------------------");
        }
    }
}
