package classcirclevaclasscylinder;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(5.0, "green", 10);
        System.out.println(cylinder);

        //thay đổi chièu cao
        cylinder.setHeight(11.0);
        System.out.println("đã thay đổi " + cylinder);
    }
}
