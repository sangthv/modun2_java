package luyentap.QuanliCongNhan;

public class kySu extends CanBo {
    private String daoTao;
    public kySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String NDT) {
    }
    public kySu(String daoTao) {
        this.daoTao = daoTao;
    }
    public kySu(String hoTen, int ngaySinh, String gioiTinh, String diaChi, String daoTao) {
        super(hoTen, String.valueOf(ngaySinh), gioiTinh, diaChi);
        this.daoTao = daoTao;
    }

    public String getDaoTao() {
        return daoTao;
    }

    public void setDaoTao(String daoTao) {
        this.daoTao = daoTao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "daoTao='" + daoTao;
    }
}
