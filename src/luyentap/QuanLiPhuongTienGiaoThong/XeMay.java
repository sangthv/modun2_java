package luyentap.QuanLiPhuongTienGiaoThong;

public class XeMay extends PhuongTienGiaoThong{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(int id, String hangSanXuat, int namSanXuat, int giaBan, String mauXe, int congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() +  "XeMay{" +
                "congSuat='" + congSuat
             ;
    }

    public void nhap(){
        super.nhap();
        System.out.println(" cong suat ");
        this.congSuat = Integer.parseInt(sc.nextLine());
    }
}
