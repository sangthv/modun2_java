package lythuyet.QuanLiSanPham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiSanPham qlsp =new QuanLiSanPham();
        Scanner src = new Scanner(System.in);
        while (true){
        System.out.println("MENU---------------");
        System.out.println("" +
                        "1. show.\n" +
                        "2. creat.\n" +
                        "3. xoa.\n" +
                        "4. sua.\n" +
                        "5. thoat");
        int luaChon = Integer.parseInt(src.nextLine());
        System.out.println("lua chon cua ban " + luaChon);
        switch (luaChon){
            case 1:
               qlsp.hienThi();
                break;
            case 2:
                qlsp.themSanPham();
                break;
            case 3:
                qlsp.xoaSanPham();
                break;
            case 4:
                qlsp.suaSanPham();
                break;
            case 5:
                return;
        }
    }
   }
}
