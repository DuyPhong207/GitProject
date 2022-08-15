package Point2D_Point3D;

public class Point3D extends Point2D{
    private float z;
    public Point3D (float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {this.x, this.y, this.z};
        return arr;
    }

    public String toString() {
        return getXYZ() + "";
    }
}
