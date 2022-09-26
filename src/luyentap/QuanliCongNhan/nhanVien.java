package luyentap.QuanliCongNhan;

public class nhanVien extends CanBo {
    private String congviec;

    public nhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congviec) {
    }

    public nhanVien(String congviec) {
        this.congviec = congviec;
    }

    public nhanVien(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String congviec) {
        super(hoTen, String.valueOf(ngaySinh), gioiTinh, diaChi);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return super.toString() + " " + " congviec= " + congviec ;
    }
}
