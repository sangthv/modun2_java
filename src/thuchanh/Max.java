package thuchanh;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner src = new Scanner(System.in);
        do{
            System.out.print("nhap so vao: ");
            size = src.nextInt();
            if(size>20){
                System.out.println("so khong vuot qua 20");
            }
        }
        while (size>20);
        array = new int[size];
        int i =0;
        while (i<array.length){
            System.out.print("so " + (i+1) + " : ");
            array [i] = src.nextInt();
            i++;
        }
        System.out.print("danh sach: ");
        for (int j= 0; j< array.length; j++){
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for (int j=0; j<array.length; j++){
            if(array[j]>max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("so lon nhat " + max + " o vi tri " + index);
    }
}
