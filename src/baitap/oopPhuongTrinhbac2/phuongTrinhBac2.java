package baitap.oopPhuongTrinhbac2;

import java.util.Scanner;

public class phuongTrinhBac2 {
    double a, b , c;
    Scanner src = new Scanner(System.in);
    public phuongTrinhBac2(){
    }
    public phuongTrinhBac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double tinhDelta(){
        double delta = b*b - (4*a*c);
        return  delta;
    }
    public double kq1(){
        double x1 = ((-b) + Math.sqrt(b*b-(4*a*c)))/(2*a);
        return  x1;
    }
    public double kq2(){
        double x2 = ((-b) - Math.sqrt(b*b-(4*a*c)))/(2*a);
        return  x2;
    }
    public double kq3(){
        double x3 = -b/2*a;
        return  x3;
    }
    public void nhap(){
        System.out.println("nhap so a: ");
        a = src.nextDouble();
        System.out.println("nhap so b: ");
        b = src.nextDouble();
        System.out.println(" nhap so c: ");
        c = src.nextDouble();
    }
    public void xuat(){
        if (tinhDelta()<0){
            System.out.println("phuong trinh vo nghiem");
        } else if (tinhDelta()==0){
            System.out.println("phuong trinh co 1 nghiem " + kq3());
        }else {
            System.out.println("nghiem 1 cua pt " + kq1());
            System.out.println("nghiem 2 cua pt " + kq2());
        }
    }
}
