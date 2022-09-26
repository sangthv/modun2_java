package luyentap.QuanLiSinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println( "MENU -------------------");
            System.out.println("vui long lua chon chuc nang :");
            System.out.println("" +
                    "1. them sinh vien vao danh sach.\n" +
                    "2. in danh sach sinh vien ra man hinh.\n" +
                    "3. kiem tra danh sach co rong hay khong.\n" +
                    "4. lay so luong sinh vien trong danh sach.\n" +
                    "5. lam rong sinh vien.\n" +
                    "6. kiem tra sinh vien co ton tai hay khong.\n" +
                    "7. xoa sinh vien trong danh sach dua tren ma sinh vien.\n" +
                    "8. tim kiem tat ca sinh vien dua theo ten tu ban phim.\n" +
                    "9. xuat ra danh sach sinh vien tu diem cao den thap" +
                    "0. thoat khoi chuong trinh");
                    luaChon = sc.nextInt();
                    sc.nextLine();
                    if (luaChon== 1){
                        System.out.println("nhap ma sinh vien: ");
                        String maSinhVien = sc.nextLine();
                        System.out.println("ho va ten: ");
                        String hoVaTen = sc.nextLine();
                        System.out.println("nam sinh: ");
                        int namSinh = sc.nextInt();
                        System.out.println("Diem trung binh: ");
                        float diemTrungBinh = sc.nextFloat();
                        SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                        dssv.themSinhVien(sv);
                    } else if (luaChon==2) {

                    } else if (luaChon==3) {

                    }else if (luaChon==4) {

                    }else if (luaChon==5) {

                    }else if (luaChon==6) {

                    }else if (luaChon==7) {

                    }else if (luaChon==8) {

                    }else if (luaChon==9) {

                    }
        } while (luaChon!=0);
    }
}
