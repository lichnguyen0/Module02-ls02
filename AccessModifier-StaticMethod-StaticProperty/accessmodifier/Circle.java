package accessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
       return Math.PI * radius * radius;
    }
}
