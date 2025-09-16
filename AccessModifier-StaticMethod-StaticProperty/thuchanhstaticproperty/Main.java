package thuchanhstaticproperty;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mazda", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
