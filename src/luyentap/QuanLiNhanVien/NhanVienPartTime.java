package luyentap.QuanLiNhanVien;

public class NhanVienPartTime extends QuanLiNhanVien  {
    private int SoNgayDiLam;
    int ngay;

    public NhanVienPartTime() {
        super();
    }

    public NhanVienPartTime(int id, String name, int age, String adress, int soNgayDiLam, int ngay) {
        super(id, name, age, adress);
        this.SoNgayDiLam = soNgayDiLam;
        this.ngay = ngay;
    }
    public double traTienTheoNgay(){
        return this.ngay * 120000;
    }

    public int getSoNgayDiLam() {
        return SoNgayDiLam;
    }

    public void setSoNgayDiLam(int soNgayDiLam) {
        SoNgayDiLam = soNgayDiLam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +
                "SoNgayDiLam=" + SoNgayDiLam +
                ", ngay=" + ngay +
                '}';
    }
}
