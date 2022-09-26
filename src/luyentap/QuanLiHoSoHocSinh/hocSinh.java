package luyentap.QuanLiHoSoHocSinh;

import java.util.Date;

public class hocSinh extends Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;

    public hocSinh() {
    }

    public hocSinh(String hoTen, Date ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public hocSinh(String lop, Double khoaHoc, int kiHoc, String hoTen, Date ngaySinh, String queQuan) {
        super(lop, khoaHoc, kiHoc);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return super.toString() + "hoTen='" + hoTen + '\'' + ", ngaySinh=" + ngaySinh
                +    ", queQuan='" + queQuan   ;
    }
}
