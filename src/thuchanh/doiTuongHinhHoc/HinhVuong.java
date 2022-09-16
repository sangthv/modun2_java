package thuchanh.doiTuongHinhHoc;

public class HinhVuong extends Shape{
    private double dai = 1;
    private double rong = 1;

    public HinhVuong() {
    }

    public HinhVuong(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public HinhVuong(String color, Boolean filled, double dai, double rong) {
        super(color, filled);
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    public double dienTich(){
        return dai*rong;
    }
    public double chuVi(){
        return (dai+rong)*2;
    }

    @Override
    public String toString() {
        return  "A Rectangle with width=" + this.rong + "and length=" + this.dai +  "which is a subclass of yyy";
    }
}
