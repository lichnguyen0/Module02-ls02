package thuchanhlophinhchunhat;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
     return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String disPlay(){
        return "rectangle{"+ width + ", " + height + "}";
    }

}


