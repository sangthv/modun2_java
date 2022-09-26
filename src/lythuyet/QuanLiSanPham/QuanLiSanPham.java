package lythuyet.QuanLiSanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSanPham {
    Scanner src= new Scanner(System.in);
    private final ArrayList<SanPham> sanPhams;

    public QuanLiSanPham() {
        this.sanPhams = new ArrayList<>();
    }

    public QuanLiSanPham(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
    public void hienThi(){
        for (int i =0 ; i<sanPhams.size(); i++){
            System.out.println(sanPhams.get(i).toString());
        }
    }
    public void themSanPham() {
        System.out.println("nhap ten san pham: ");
        String name = src.nextLine();
        System.out.println("nhap gia: ");
        int gia = Integer.parseInt(src.nextLine());
        System.out.println("nhap id: ");
        int id = Integer.parseInt(src.nextLine());
        SanPham sanPham = new SanPham(name,gia,id);
        sanPhams.add(sanPham);
    }
    public void xoaSanPham(){
        System.out.println(" nhap ten muon xoa: ");
        String name = src.nextLine();
        for (int i = 0; i< sanPhams.size(); i++){
            System.out.println(sanPhams.get(i).getName().equals(name));
            sanPhams.remove(i);
        }
    }
    public void suaSanPham(){
        System.out.println(" sua ten san pham: ");
        String name = src.nextLine();
        for (int i =0; i< sanPhams.size(); i++){
            System.out.println(sanPhams.get(i).getName().equals(name));
            System.out.println("nhap ten san pham: ");
            String ten = src.nextLine();
            System.out.println("nhap gia: ");
            int gia = Integer.parseInt(src.nextLine());
            System.out.println("nhap id: ");
            int id = Integer.parseInt(src.nextLine());
            SanPham sanPham = new SanPham(ten,gia,id);
            sanPhams.set(i,sanPham);
        }
    }
}
