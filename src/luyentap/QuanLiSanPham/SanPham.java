package luyentap.QuanLiSanPham;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private double giaSanPham;
    private int soLuong;
    private String moTa;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, double giaSanPham, int soLuong, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return
                "maSanPham ='" + maSanPham  +
                ", tenSanPham='" + tenSanPham +
                ", giaSanPham=" + giaSanPham +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa  ;

    }
}
