package luyentap.QuanLiMang;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLiMang {

    public static void main(String[] args) {
        int them;
        int viTri;
        int value;
        System.out.print(" nhap so phan tu ban nhap: ");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int [] arr = new int[n];
        for ( int i = 0; i< arr.length; i++){
            System.out.print("nhap phan tu co vi tri: " + i );
            int a = src.nextInt();
            arr[i] = a;
        }
//        them phan tu mang............
        System.out.print(" them phan tu: ");
        them = src.nextInt();
        System.out.print(" vi tri phan tu: ");
        viTri = src.nextInt();
        System.out.print(" nhap gia tri thay doi");
        value = src.nextInt();
        int [] arr1 = new int [arr.length + 1];
      for (int i = 0; i< arr1.length; i++){
          if(i<viTri){
              arr1[i]= arr[i];
          } else if(i == viTri){
              arr1[i]= them;
          } else {
              arr1[i] = arr[i-1];
          }
          arr1[viTri] = value;

      }

        System.out.println("sô phan tu mang mơi" + Arrays.toString(arr1));
        System.out.println("ket qua sua mang " +Arrays.toString(arr));
    }
}
