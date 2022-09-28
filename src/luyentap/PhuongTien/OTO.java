package luyentap.PhuongTien;

import java.util.Scanner;

public class OTO extends PhuongTienGT{
    private  int choNgoi;
    private String kieuDongCo;

    public OTO() {
    }

    public OTO(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public OTO(int id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, int choNgoi) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.choNgoi = choNgoi;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    Scanner src = new Scanner(System.in);
    public void nhap(){
        System.out.println(" nhap thong tin oto");
        super.nhap();
        System.out.println("nhap cho ngoi ");
        this.choNgoi = Integer.parseInt(src.nextLine());
        System.out.println(" nhap dong co ");
        this.kieuDongCo = src.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println("" +
                "cho ngoi co " + choNgoi + " kieu dong co la " + kieuDongCo);
    }
}
