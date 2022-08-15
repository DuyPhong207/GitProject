package Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean status = true;
    private String color = "Black";
    private double radius = 5;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = true;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan() {
    }

    public Fan(int speed, boolean status, String color, double radius) {
        this.speed = speed;
        this.status = status;
        this.color = color;
        this.radius = radius;
    }

    public String disPlay() {
        String display = "";
        if (this.getStatus()) {
            display += "Fan is on" + "\nSpeed : " + this.speed;
        } else {
            display += "Fan is off";
        }
        display += "\nColor : " + this.color;
        display += "\nRadius :" + this.radius;
        return display;
    }
}

