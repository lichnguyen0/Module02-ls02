package xaydunglopfan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + this.speed +
                    ", on=" + this.on +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' + "fan is on" +
                    '}';
        } else {
            return "Fan{ " +
                    "radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    ", fan is off }";
        }
    }
}
