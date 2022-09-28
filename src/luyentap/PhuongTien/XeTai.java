package luyentap.PhuongTien;

public class XeTai extends PhuongTienGT{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(int id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public void nhap() {
        System.out.println(" nhap thong tin trong tai");
        super.nhap();
        System.out.println(" nhap trong tai");
        this.trongTai = Double.parseDouble(src.nextLine());

    }
    public void xuat(){
        super.xuat();
        System.out.println(" trong tai la " + trongTai);
    }
}
