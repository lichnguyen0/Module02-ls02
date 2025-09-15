package xaydunglopquadraticequation;

public class Quadraticequation {

    private double a;
    private double b;
    private double c;

    public Quadraticequation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Quadraticequation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDisCriminant() {
        return b * b - 4 * a * c;
    }


    public double getRoot1() {
        double delta = getDisCriminant();
        if (delta >= 0) {
            return -b + Math.pow(delta, 0.5) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDisCriminant();
        if (delta >= 0) {
            return -b - Math.pow(delta, 0.5) / (2 * a);
        } else {
            return 0;
        }
    }
}
