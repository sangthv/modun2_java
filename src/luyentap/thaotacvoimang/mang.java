package luyentap.thaotacvoimang;

import java.util.Arrays;
import java.util.Scanner;

public class mang {
    public static void main(String[] args) {
        int [] arr = new int[] { 1,3,5,7,8};
        System.out.println("mảng cũ: " + Arrays.toString(arr));
//    them phan tu cuoi mang         ///////
        System.out.print(" nhap them phan tu cuoi mang: ");
        Scanner src = new Scanner(System.in);
        int a;
        a = src.nextInt();
        int [ ] arr1 = new int[arr.length+ 1];
        for (int i = 0 ; i< arr.length; i++){
            arr1[i]= arr [i];
        }
        arr1[arr1.length -1] = a;
        System.out.println(" mang da them  : " + Arrays.toString(arr1));

//        xoa mang...............
        System.out.print(" xoa vị trí phan tu trong mang: ");
        int x = src.nextInt();
        int [] b = new int[arr.length - 1];
        for ( int i = 0; i<arr.length- 1; i ++){
            if (i<x){
                b[i]= arr[i];
            } else if ( i>=x){
                b[i]= arr[i +1];
//            } else   {
//                b[i]= arr[i+1];
            }
        }
        System.out.println("mảng đã xóa là : " + Arrays.toString(b));

//        sửa mảng....
        System.out.print(" vị trí cần sửa: ");
        int viTriY = src.nextInt();
        System.out.print(" số sửa vào mảng mới: ");
       int suaThanh = src.nextInt();
       arr[viTriY] = suaThanh;
        System.out.print("mảng đã sửa lại " + Arrays.toString(arr));
    }
}
