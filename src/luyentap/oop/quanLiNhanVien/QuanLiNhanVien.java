package luyentap.oop.quanLiNhanVien;

import java.util.Scanner;

public class QuanLiNhanVien {
        String name, adress;
        int age, id;
   public QuanLiNhanVien(){
   }
   public QuanLiNhanVien (String name, String adress, int age , int id){
    this.name = name;
    this.adress = adress;
    this.age = age;
    this.id = id;
   }
        public String SetName(){
                return name;
        }
        public String SetAdress(){
                return adress;
        }
           public int SetId(){
                return id;
        }
        public int SetAge(){
                return age;
        }
        public void Nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.println(" nhap ten: ");
            name = sc.nextLine();
            System.out.println(" nhap tuoi: ");
            age  = Integer.parseInt(sc.nextLine());
            System.out.println("nhap dia chi: ");
            adress = sc.nextLine();
            System.out.println("nhap id: ");
            id = Integer.parseInt(sc.nextLine());
        }
        public void xuat(){
            System.out.println(" ten la " + name + "dia chi " + adress + age + " tuoi " + " co id la " + id );
        }
}
