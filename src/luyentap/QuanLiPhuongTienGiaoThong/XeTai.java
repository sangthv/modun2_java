package luyentap.QuanLiPhuongTienGiaoThong;

public class XeTai extends PhuongTienGiaoThong{
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe, int trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() + "XeTai{" +
                "trongTai='" + trongTai  ;

    }
    public void nhap() {
        super.nhap();
        System.out.println(" cong suat ");
        this.trongTai = Integer.parseInt(sc.nextLine());
    }
}
