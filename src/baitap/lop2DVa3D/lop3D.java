package baitap.lop2DVa3D;

public class lop3D extends lop2D {
    private float z;

    public lop3D() {
    }

    public lop3D(float z) {
        this.z = z;
    }

    public lop3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        super.getxy();
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setxyz(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getxyz(){
        float [] arr1 = new float[]{super.getX() , super.getY() , this.z};
        return arr1;
    }

    @Override
    public String toString() {
        return super.toString()+
                "z=" + z ;
    }
}
