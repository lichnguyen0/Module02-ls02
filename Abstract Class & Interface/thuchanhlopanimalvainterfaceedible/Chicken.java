package thuchanhlopanimalvainterfaceedible;

public class Chicken extends Animal implements Edible { // dòng này vừa sử dụng abstract và interface
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
