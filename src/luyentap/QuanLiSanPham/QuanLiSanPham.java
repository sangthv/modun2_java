package luyentap.QuanLiSanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSanPham {
   ArrayList <SanPham > sanPhams = new ArrayList <>();
    Scanner src = new Scanner(System.in);

    public SanPham thongTinSanPham(){
            System.out.println("ma san pham la: ");
            String maSanPham = src.nextLine();
            System.out.println(" ten san pham: ");
            String tenSanPham = src.nextLine();
            System.out.println("gia san pham: ");
            double giaSanPham = src.nextDouble();
            System.out.println( " so luong: ");
            int soLuong = Integer.parseInt(src.nextLine());
            System.out.println(" mo ta san pham: ");
            String moTa = src.nextLine();

        SanPham sanPhams = new SanPham(maSanPham, tenSanPham, giaSanPham, soLuong, moTa);
        return sanPhams;
    }
    public void add (){
        SanPham sp = thongTinSanPham();
        sanPhams.add(sp);
    }
    public void show(){
        for (int i = 0; i < sanPhams.size(); i++) {
            System.out.println(sanPhams.toString());
        }
    }
}
