package accessmodifier;

public class Main {
    public static void main(String[] args) {

        //tao đối tượng contructor không tham số
        Circle c1 = new Circle();
        System.out.println("Radius c1 = " + c1.getRadius());
        System.out.println("Area c1 = " + c1.getArea());

        //tạo đối tượng bắng contructor có tham số
        Circle c2 = new Circle(2.5);
        System.out.println("Radius c2 = " + c2.getRadius());
        System.out.println("Area c2 = " + c2.getArea());

    }
}
