package thuchanh.DoPhucTapThuatToan;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao 1 chuoi");
        String nhapChuoi = scanner.nextLine();

        int [] frequetChar = new int [255];
        for (int i = 0; i < nhapChuoi.charAt(i); i++) {
            int ascii = (int) nhapChuoi.charAt(i);
            frequetChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequetChar[j]> max){
                max = frequetChar[j];
                character = (char) j;
            }
        }
        System.out.println(" the most appearing letter is " + character + "with a frequency of " + max + " times ");
    }
}
