package luyentap.QuanLiPhuongTienGiaoThong;

import java.util.Scanner;

public class OTo extends PhuongTienGiaoThong {
    private int choNgoi;
    private String kieuDongCo;

    public OTo() {
    }

    public OTo(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public OTo(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe, int choNgoi) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.choNgoi = choNgoi;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    Scanner sc = new Scanner(System.in);

    public void nhap(){
        super.nhap();
        System.out.println(" nhap cho ngoi ");
        this.choNgoi = Integer.parseInt(sc.nextLine());
        System.out.println(" nhap kieu dong co: ");
        this.kieuDongCo = sc.nextLine();

    }

    @Override
    public String toString() {
        return  super.toString() +"OTo{" +
                "choNgoi=" + choNgoi +
                ", kieuDongCo='" + kieuDongCo  ;


    }

    }