package Poin_MoveAblePoint;

public class MoveAblePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed = {this.xSpeed, this.ySpeed};
        return speed;
    }
    @Override
    public String toString() {
        return getXY() + ", speed = " + getSpeed();
    }

    public MoveAblePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
}
