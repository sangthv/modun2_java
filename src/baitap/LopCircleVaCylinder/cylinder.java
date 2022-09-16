package baitap.LopCircleVaCylinder;

public class cylinder extends Circle{
    private double height;

    public cylinder() {
    }

    public cylinder(double height) {
        this.height = height;
    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double TheTich(){
//        return super.DienTich()*this.height;
        return Math.PI*super.getRadius()*super.getRadius()*this.height;
    }

    @Override
    public String toString() {
        return super.toString() + "chieu cao " + this.height+  "" + this.TheTich();
    }
}
