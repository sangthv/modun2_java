package luyentap.PhuongTien;

import java.util.Scanner;

public class PhuongTienGT {
    private int id;
    private String hangSanXuat;
    private String namSanXuat;
    private double giaBan;
    private String mauXe;

    public PhuongTienGT() {
    }

    public PhuongTienGT(int id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe) {
        this.id = id;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }
    Scanner src = new Scanner(System.in);
    public void nhap(){

        System.out.println("nhap ID: ");
        this.id = Integer.parseInt(src.nextLine());
        System.out.println(" nhap hãng sản xuất: ");
        this.hangSanXuat = src.nextLine();
        System.out.println(" nhap năm sản xuất: ");
        this.namSanXuat = src.nextLine();
        System.out.println(" nhập giá bán : ");
        this.giaBan =Double.parseDouble(src.nextLine());
        System.out.println(" nhap màu xe ");
        this.mauXe = src.nextLine();
    }

    public void xuat() {
        System.out.println("phương tiện giao thông : " +
                "ID là: " + id + "hãng xản xuất là " + hangSanXuat + " năm sản xuất là " + namSanXuat +
                " giá bán là " + giaBan + " màu xe là " + mauXe);
    }
}
