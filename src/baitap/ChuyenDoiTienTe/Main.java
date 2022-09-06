package baitap.ChuyenDoiTienTe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("mời bạn nhập số tiền: ");
        usd= sc.nextDouble();
        double DoiTien=usd*23000;
        System.out.print("giá trị của vnd: " + DoiTien);
    }
}
