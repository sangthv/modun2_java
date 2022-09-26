package luyentap.QuanLiHoSoHocSinh;

import java.util.Date;
import java.util.Scanner;

public class QuanLiHocSinh  {
    Nguoi [] thongtin ={};
    Scanner src = new Scanner(System.in);
    public void them(){
        for (int i = 0; i < thongtin.length; i++) {
            System.out.println(" ho ten: ");
            String hoTen = src.nextLine();
            System.out.println(" ngay Sinh: ");
          int ngaySinh = Integer.parseInt(src.nextLine());
            System.out.println("que Quan");
            String queQuan = src.nextLine();
        }
    }
}

