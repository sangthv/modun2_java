package thuchanh.doiTuongHinhHoc;

public class Square extends HinhVuong {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double dai, double rong) {
        super(color, filled, dai, rong);
    }
    public double getSide(){
            return getDai();
    }
//    public void setSide(){
//        setDai(side);
    }

