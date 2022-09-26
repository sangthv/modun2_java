package luyentap.QuanLiSanPham;

import java.util.Scanner;

public class Main {
    static QuanLiSanPham quanLiSanPham = new QuanLiSanPham();
   static   Scanner src = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" menu: ");
        System.out.println("1.xem danh sach: ");
        System.out.println("2. them moi: ");
        System.out.println("3. cap nhap: ");
        System.out.println( "4. xoa: ");
        System.out.println(" 5. sap xep: ");
        System.out.println(" 6. tim san pham dat nhat: ");
        System.out.println(" 7. thoat ");


        int choice = src.nextInt();

        switch (choice){
            case 1:
                quanLiSanPham.add();
                break;
            case 2:

                break;
            case 3:

                break;
        }

    }
}
