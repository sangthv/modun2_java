package luyentap.QuanLiHoSoHocSinh;

public class Nguoi {
    private String lop;
    private Double khoaHoc;
    private int kiHoc;

    public Nguoi() {
    }

    public Nguoi(String lop, Double khoaHoc, int kiHoc) {
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kiHoc = kiHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Double getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(Double khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(int kiHoc) {
        this.kiHoc = kiHoc;
    }

    @Override
    public String toString() {
        return "lop='" + lop +
                ", khoaHoc=" + khoaHoc +
                ", kiHoc=" + kiHoc;
    }
}
