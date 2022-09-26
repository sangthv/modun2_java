package luyentap.QuanliCongNhan;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLiCanBo {
    CanBo[] nhanVien = {};
    Scanner src = new Scanner(System.in);

    public void ThongTin() {
        CanBo[] themNhanVien = new CanBo[nhanVien.length + 1];
        CanBo nhanvienD = TaoNhanVien();
        for (int i =0; i<nhanVien.length ; i++){
            themNhanVien[i] = nhanVien[i];
        }
        themNhanVien[themNhanVien.length - 1] = nhanvienD;
        nhanVien = themNhanVien;
        System.out.println(Arrays.toString(nhanVien));
    }

    public CanBo TaoNhanVien() {
        System.out.print("nhập name: ");
        String hoTen = src.nextLine();

        System.out.print("Nhập ngày tháng năm sinh: ");
        String ngaySinh = src.nextLine();

        System.out.print("Nhập giới tính ");
        String gioiTinh = src.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String diaChi = src.nextLine();

        System.out.println("nhập loại cán bộ     1. công nhân       2.Kĩ sư             3. Nhân viên ");
        int loai = Integer.parseInt(src.nextLine());
        CanBo nvm;
        if (loai == 1) {
            System.out.println("nhập cấp bậc");
            int bac = Integer.parseInt(src.nextLine());
            nvm = new congNhan (hoTen, ngaySinh, gioiTinh, diaChi, bac);
        } else if (loai == 2) {
            System.out.println("nhập ngành đào tạo");
            String NDT = src.nextLine();
            nvm = new kySu(hoTen,ngaySinh, gioiTinh, diaChi, NDT);
        } else {
            System.out.println("nhập công việc");
            String congviec = src.nextLine();
            nvm = new nhanVien(hoTen, ngaySinh, gioiTinh, diaChi, congviec);
        }
        return nvm;
    }
}
