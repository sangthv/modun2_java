package luyentap.QuanLiNhanVien;

import java.util.Scanner;

public class Test {
    public static void nhap() {
        QuanLiNhanVien[] arr = new QuanLiNhanVien[100];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhâp số lượng nhân viên: ");

            int sl = sc.nextInt();
            if (sl > 100) {
                System.out.println("nhạp lại sl");
            } else {
                for (int i = 0; i < sl; i++) {
                    System.out.println("Nhap ten: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    System.out.println("Loại nhân viên: 1. fulltime 2.part");
                    int loai = sc.nextInt();
                    if (loai == 1) {
                        System.out.println("Luong: ");
                        double luong = sc.nextDouble();
                        NhanVienFullTime full = new NhanVienFullTime(1, ten, 21, "hn", luong);
                        arr[i] = full;
                    } else {
                        System.out.println("So ngay: ");
                        int sn = sc.nextInt();
                        NhanVienPartTime part = new NhanVienPartTime(1, ten, 21, "da", sn, sn);
                        arr[i] = part;
                    }

                }
                for (int i = 0; i < sl; i++) {
                    System.out.println(arr[i]);
                }
                for (int i = 0; i < sl; i++) {
                    if (arr[i] instanceof NhanVienPartTime) {
                        System.out.println("part time: " + ((NhanVienPartTime) arr[i]).getSoNgayDiLam() * 120000);
                    } else {
                        System.out.println("fulltime: " + ((NhanVienFullTime) arr[i]).luong());
                    }

                }
            }
        }


    }

    public static void main(String[] args) {

        nhap();


    }
}