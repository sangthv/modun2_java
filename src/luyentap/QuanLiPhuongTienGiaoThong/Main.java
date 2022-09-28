package luyentap.QuanLiPhuongTienGiaoThong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLi ql = new QuanLi();
        int luaChon = 0;
        do {
            System.out.println(" nhap lua chon: ");
            System.out.println("" +
                    "1. Them ID.\n" +
                    "2. Sua ID.\n" +
                    "3. Xoa ID.\n" +
                    "4. Tim phuong tien theo hang san xuat và theo màu.\n" +
                    "5. sap xep.\n" +
                    "6. the hien.\n" +
                    "0. Thoat");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    ql.them();
                    break;
                case 2:
                    ql.sua();
                    break;
                case 3:
                    ql.xoa();
                    break;
                case 4:
                    ql.timPhuongTien();
                    break;
                case 5:
                    ql.sapXep();
                    break;
                case 6:
                    ql.hienThi();
                    break;

            }
        }while (luaChon !=0);
    }
}
