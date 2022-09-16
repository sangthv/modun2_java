package luyentap.quanLiMangSo;

import java.util.Scanner;

public class ChucNang {
    Scanner src = new Scanner(System.in);
    int [] arr = new int[]{};
    public void HienThi(){
        System.out.println(" mảng moi là: ");
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public void them() {
        System.out.println("Nhập số muốn thêm");
        int so = Integer.parseInt(src.nextLine());

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = so;
        arr = newArr;
    }

}
