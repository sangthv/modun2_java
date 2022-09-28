package luyentap.PhuongTien;

import java.util.*;

public class QuanLi {
    ArrayList <PhuongTienGT> phuongTien = new ArrayList<>();
    Scanner src = new Scanner(System.in);

    public void them(){
        int chon;
        do {
            System.out.println(" chon loai xe : 1. oto  2. xe may   3. xe tai ");
            System.out.println(" lua chon cua ban la: ");
            System.out.println("--------------------------------------------------");
            chon = Integer.parseInt(src.nextLine());
            switch (chon){
                case 1:
                    OTO oto = new OTO();
                    oto.nhap();
                    phuongTien.add(oto);
                    break;
                case 2:
                    XeMay xeMay = new XeMay();
                    xeMay.nhap();
                    phuongTien.add(xeMay);
                    break;
                case 3:
                    XeTai xeTai = new XeTai();
                    xeTai.nhap();
                    phuongTien.add(xeTai);
                    break;
            }
            System.out.println(" ban co muon nhap tiep hay khong ? Y / N");
    }while (src.nextLine().equalsIgnoreCase("Y"));
    }
    public void hienThi(){
        for (PhuongTienGT x: phuongTien ) {
           x.xuat();
        }
    }
    public void xoa(){
        int check = 0;
        System.out.println(" xoa theo ID ");
        int id = Integer.parseInt(src.nextLine());
        for (int i =0; i<phuongTien.size(); i++){
           if( id == phuongTien.get(i).getId()){
               phuongTien.remove(i);
               check = 1;
               break;
           }
        }
        if (check==1){
            System.out.println(" danh sach sau xoa");
            this.hienThi();
        } else {
            System.out.println(" khong hien thi id nay ");
        }
    }
    public void sua(){
        System.out.println(" nhap id muon sua ");
        int id = Integer.parseInt(src.nextLine());
        for (int i = 0; i<phuongTien.size(); i++){
            if (id == phuongTien.get(i).getId()){
                if (phuongTien.get(i) instanceof OTO){
                    phuongTien.get(i).nhap();
                    break;
                } else if (phuongTien.get(i) instanceof XeMay) {
                    phuongTien.get(i).nhap();
                    break;
                } else if (phuongTien.get(i) instanceof XeTai) {
                    phuongTien.get(i).nhap();
                    break;
                }else {
                    System.out.println(" khong ton tai");
                    break;
                }
            }
        }
    }
    public void sapXep(){
        Comparator <PhuongTienGT> pt = (o1, o2) -> {
            if (o1.getId() < o2.getId()) {
                return -1;
            } else if (o1.getId() == o2.getId()) {
                return 0;
            } else {
                return 1;
            }
        };
        Collections.sort(phuongTien, pt);
        this.hienThi();
    }
    public void tim(){
        int check = 0;
        int i = 0;
        System.out.println(" nhap nam san xuat va mau muon tim ");
        System.out.println(" nam san xuat ");
        String namSanXuat = src.nextLine();
        System.out.println(" mau ");
        String mau = src.nextLine();
        for ( i = 0; i < phuongTien.size(); i++) {
            if (phuongTien.get(i).getNamSanXuat().equalsIgnoreCase(namSanXuat) && phuongTien.get(i).getMauXe().equalsIgnoreCase(mau) ){
                check = 1;
                break;
            }
        }
        if (check == 1){
            phuongTien.get(i).xuat();
        } else {
            System.out.println("khong ton tai");
        }
    }
    public  void menu (){
        int chon;
        do {
            System.out.println("-------------------------------------");
            System.out.println("" +
                    "1. them.\n" +
                    "2. hien Thi.\n" +
                    "3. xoa.\n" +
                    "4. sua.\n" +
                    "5. sap xep.\n" +
                    "6. tim'\n" +
                    "0. thoat");
            System.out.println("--------------------------------------");
            System.out.println(" lua chon cua ban");
            chon = Integer.parseInt(src.nextLine());

            switch (chon){
                case 1:
                    this.them();
                    break;
                case 2:
                    this.hienThi();
                    break;
                case 3:
                    this.xoa();
                    break;
                case 4:
                    this.sua();
                    break;
                case 5:
                    this.sapXep();
                    break;
                case 6:
                    this.tim();
                    break;
            }
        }while (chon != 0);
    }
}
