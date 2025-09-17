package loppoint2dvaloppoint3d;

public class Main {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(3.5f, 2.5f);
        System.out.println("point2D: " + p2);

        Point3D p3 = new Point3D(2.0f, 3.0f, 4.0f);
        System.out.println("point3D: " + p3);


        p3.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("Cập nhật: " + p3);
    }
}
