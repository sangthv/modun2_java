package luyentap.QuanliCongNhan;

public class congNhan extends CanBo{
    private int bac;

    public congNhan() {
    }

    public congNhan(int bac) {
        this.bac = bac;
    }

    public congNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, int bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bac=" + bac ;
    }
}
