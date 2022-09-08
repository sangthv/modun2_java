package thuchanh.timViTrimang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] student = new String[]{"hoa", "lan", "nam", "phuong"};
        Scanner src= new Scanner(System.in);
        System.out.print("nhập tên sinh viên: ");
        String input_name = src.nextLine();
        boolean isExist = false;
        for(int i=0; i<student.length; i++){
            if (student[i].equals(input_name)) {
                System.out.println("vi tri sinh vien la " + input_name + " la: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("khong thay " + input_name + "trong danh sach");
        }
    }
}
