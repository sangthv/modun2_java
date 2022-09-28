package luyentap.QuanLiPhuongTienGiaoThong;

import java.util.Scanner;

public class PhuongTienGiaoThong {
    private int id;
    private String hangSanXuat;
    private int namSanXuat;
    private int giaBan;
    private String mauXe;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe) {
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

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    Scanner sc = new Scanner(System.in);

    public void nhap (){
        PhuongTienGiaoThong phuongTienGiaoThong = new PhuongTienGiaoThong();
        System.out.println(" nhap ID");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("hang san xuat");
        this.hangSanXuat = sc.nextLine();
        System.out.println(" nam san xuat ");
        this.namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println(" gia ban ");
        this.giaBan = Integer.parseInt(sc.nextLine());
        System.out.println(" mau xe");
        this.mauXe = sc.nextLine();


    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "id=" + id +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe   ;

    }
    public void xuat(){
        System.out.println("PhuongTienGiaoThong{" +
                "id=" + id +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe  );

    }

}
