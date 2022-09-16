package baitap.lop2DVa3D;

public class lop2D {
    private float x;
    private float y;

    public lop2D() {
    }
    public lop2D(float x, float y) {
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

    public float[] getxy() {
        float [] arr = new float[]{this.x, this.y};
        return arr;
    }

    public void setXY(float x, float y ) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y ;
    }
}
