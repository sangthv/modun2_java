package luyentap.PhuongTien;

public class XeMay extends PhuongTienGT{
    private double congSuat;

    public XeMay() {
    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(int id, String hangSanXuat, String namSanXuat, double giaBan, String mauXe, double congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    public void nhap(){
        System.out.println("nhap thong tin xe may ");
        super.nhap();
        System.out.println(" nhap cong suat");
        this.congSuat = Double.parseDouble(src.nextLine());
    }
    public void xuat(){
        super.xuat();
        System.out.println(" cong suat la " + congSuat);
    }
}
