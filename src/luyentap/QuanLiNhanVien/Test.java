package luyentap.QuanLiNhanVien;

import java.util.Scanner;

public class Test {
    static QuanLiNhanVien[] arr = new QuanLiNhanVien[0];

    public static void nhap() {
        Scanner sc = new Scanner(System.in);
        int sl;
        System.out.println("nhâp số lượng nhân viên: ");
        sl = Integer.parseInt(sc.nextLine());
        while (sl > 100 || sl < 0) {
            System.out.println("nhâp số lượng nhân viên: ");
            sl = sc.nextInt();
            if (sl > 100) {
                System.out.println("nhạp lại sl");
            }
        }
        arr = new QuanLiNhanVien[sl];
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap ten: ");
//            sc.nextLine();
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
            System.out.println(arr[i].getName());
            if (arr[i] instanceof NhanVienPartTime) {
                System.out.println("part time: " + ((NhanVienPartTime) arr[i]).getSoNgayDiLam() * 120000);
            } else {
                System.out.println("fulltime: " + ((NhanVienFullTime) arr[i]).luong());
            }

        }
    }
    public static void themNhanVien(){
        System.out.println(" thêm nhân viên: ");
        QuanLiNhanVien [] arr1 = new QuanLiNhanVien[arr.length+1];
        for (int i= 0; i<arr.length; i++){
            arr1[i]= arr[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
//        sc.nextLine();
        String ten = sc.nextLine();
        System.out.println("Loại nhân viên: 1. fulltime 2.part");
        int loai = sc.nextInt();
        if (loai == 1) {
            System.out.println("Luong: ");
            double luong = sc.nextDouble();
            NhanVienFullTime full = new NhanVienFullTime(1, ten, 21, "hn", luong);
            arr1[arr1.length-1] = full;
        } else {
            System.out.println("So ngay: ");
            int sn = sc.nextInt();
            NhanVienPartTime part = new NhanVienPartTime(1, ten, 21, "da", sn, sn);
            arr1[arr1.length-1] = part;
        }
        arr = arr1;
        System.out.println(arr[arr.length-1].getName());
        if (arr[arr.length-1] instanceof NhanVienPartTime) {
            System.out.println("part time: " + ((NhanVienPartTime) arr[arr.length-1]).getSoNgayDiLam() * 120000);
        } else {
            System.out.println("fulltime: " + ((NhanVienFullTime) arr[arr.length-1]).luong());
        }
    }
    public static void main(String[] args) {
            nhap();
            themNhanVien();
    }
}