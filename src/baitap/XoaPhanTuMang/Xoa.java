package baitap.XoaPhanTuMang;

import java.util.Arrays;

public class Xoa {
    public static void main(String[] args) {
        int [] array = new int[] {1,3,5,7};
        int [] array1 = new int[array.length-1];
        int index = 3;
        for ( int i=0; i< array1.length; i++){
            if(i<index){
                array1[i]= array[i];
            } else if (i==index) {
            } else {
                array1[i] = array[i+1];
            }
        }
        System.out.println("ket qua "+ Arrays.toString(array1));
    }
}
