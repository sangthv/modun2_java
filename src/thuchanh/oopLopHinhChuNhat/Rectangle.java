package thuchanh.oopLopHinhChuNhat;

public class Rectangle {
    int width;
    int length;
    public Rectangle(int inputwidth, int inputLength) {
        width = inputwidth;
        length = inputLength;
    }

    public String area() {
        int area = width * length;
        return "" + area;
    }
}
