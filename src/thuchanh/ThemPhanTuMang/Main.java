package thuchanh.ThemPhanTuMang;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new  int[]{1,3,5,7};
        System.out.println(Arrays.toString(array));
        int N = array.length;
        array = Arrays.copyOf(array, N+3);
        array [N]= 6;
        array [N+1] = 5;
        array [N+2] = 4;
        System.out.println("ket qua: " + Arrays.toString(array));
    }
}
