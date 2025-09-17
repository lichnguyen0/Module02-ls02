package classcirclevaclasscylinder;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder() {
    }

    ;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius=" + getRadius() +
                ", color=" + getColor() +
                ", height=" + height +
                ", volume=" + getVolume() +
                ", which is a subclass of " + super.toString();
    }
}
