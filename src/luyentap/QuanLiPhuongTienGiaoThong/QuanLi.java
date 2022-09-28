package luyentap.QuanLiPhuongTienGiaoThong;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLi {
    static Scanner sc = new Scanner(System.in);
    static  ArrayList < PhuongTienGiaoThong > phuongTien = new ArrayList<PhuongTienGiaoThong>();

    public void them(){
        System.out.println(" nhap loai xe: 1. oto   2. xe may    3. xe tai");
        int loai = Integer.parseInt(sc.nextLine());
        PhuongTienGiaoThong a;
        if( loai == 1){
            a = new OTo();
            a.nhap();
        } else if (loai==2) {
            a = new XeMay();
            a.nhap();
        } else {
            a = new XeTai();
            a.nhap();
        }
        phuongTien.add(a);
    }

    public void sua(){
        System.out.println("nhap id muon sua: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < phuongTien.size(); i++) {
            if(id==phuongTien.get(i).getId()){
                System.out.println("Nhap mau mơi: ");
                String mau = sc.nextLine();
                phuongTien.get(i).setMauXe(mau);
            }
        }
    }
    public void xoa(){
        System.out.println("nhap id muon xoa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < phuongTien.size(); i++) {
            if (id == phuongTien.get(i).getId()) {
                phuongTien.remove(i);
            }
        }
    }
    public void hienThi(){
        for (PhuongTienGiaoThong x : phuongTien){
            System.out.println(x.toString());
        }
    }
    public void timPhuongTien (){
        System.out.println(" nhap hang san xuat:");
        String hangSX = sc.nextLine();
        System.out.println(" nhap mau xe");
        String mauXe = sc.nextLine();

        for (int i = 0; i < phuongTien.size(); i++) {
            if( phuongTien.get(i).getHangSanXuat().equals(hangSX)){
                System.out.println(" tim hang san xuat " + phuongTien.get(i).toString());
            }
            if (phuongTien.get(i).getMauXe().equals(mauXe)){
                System.out.println(" mau xe " + phuongTien.get(i).toString());
            }
        }
    }
    public void sapXep(){
        for (int i = 0; i < phuongTien.size() -1; i++) {
            for (int j = phuongTien.size() -1; j >i; j--) {
                if(phuongTien.get(i).getId()> phuongTien.get(j).getId()){
                    PhuongTienGiaoThong temp = phuongTien.get(i);
                    phuongTien.set(i, phuongTien.get(j));
                    phuongTien.set(j, temp);
                }
            }
        }
    }
}
