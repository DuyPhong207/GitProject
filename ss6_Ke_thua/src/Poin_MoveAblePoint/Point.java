package Poin_MoveAblePoint;

public class Point {
    protected float x;
    protected float y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }
    @Override
    public String toString() {
        return getXY() + "";
    }
}

