package luyentap.QuanLiSinhVien;

public class SinhVien {
     private String maSinhVien;
     private String hoVaTen;
     private int namSinh;
     private float diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

}
