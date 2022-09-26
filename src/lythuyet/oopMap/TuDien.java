package lythuyet.oopMap;

import java.util.*;

public class TuDien {
    private final Map<String, String> duLieu = new TreeMap<String, String>();

    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }

    public String traTu(String tuKhoa) {
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong() {
        return this.duLieu.size();
    }

    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("menu ----------------");
            System.out.println("" +
                    "1. them tu.\n" +
                    "2. xoa tu.\n" +
                    "3.tim y nghia tu.\n" +
                    "4. in danh sachs tu khoa.\n" +
                    "5. in ra so luong tu.\n" +
                    "6. xoa tat ca phan tu.\n" +
                    "0. thoat ");
            luaChon = Integer.parseInt(sc.nextLine());
            if (luaChon == 1) {
                System.out.println(" nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.println(" nhap vao y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2  ) {
                System.out.println(" nhap tu muon xoa: ");
                String tuKhoa = sc.nextLine();
                    tuDien.xoaTu(tuKhoa);
                } else if (luaChon == 3){
                System.out.println(" nhap tu muon dich ra: ");
                String tuKhoa = sc.nextLine();
                    System.out.println("y nghia la: " + tuDien.traTu(tuKhoa));
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            } else if (luaChon == 5) {
                System.out.println(" so luong tu khoa: " + tuDien.laySoLuong());
            } else if (luaChon == 6) {
                tuDien.xoaTatCa();
            }
        } while (luaChon != 0);
    }
}
