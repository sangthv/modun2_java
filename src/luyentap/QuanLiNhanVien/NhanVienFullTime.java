package luyentap.QuanLiNhanVien;

public class NhanVienFullTime extends QuanLiNhanVien {
    private double solary;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(int id, String name, int age, String adress, double solary) {
        super(id, name, age, adress);
        this.solary = solary;
    }
    public double luong(){
        return this.solary;
    }

    @Override
    public String toString() {
        return  "NhanVienFullTime{" +
                "solary=" + solary +
                '}';
    }
}
