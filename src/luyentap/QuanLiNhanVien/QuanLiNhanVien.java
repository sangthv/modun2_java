package luyentap.QuanLiNhanVien;

import java.util.Scanner;

public class QuanLiNhanVien {
    private int id;
    private String name;
    private int age;
    private String adress;

    public QuanLiNhanVien() {
    }

    public QuanLiNhanVien(int id, String name, int age, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "QuanLiNhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}
