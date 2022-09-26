package thuchanh.TimKiemNhiPhan;

import java.util.Arrays;

public class TimKiem {
    static int [] arr = {1,4,5,6,8,5,9,2,4,1};

    static int timKiemGiaTri( int [] arr , int value){
        int low = 0;
        int hight = arr.length- 1;
        while (hight >= low){
            int mid = (low + hight)/ 2;
            if( value < arr[mid]){
                hight = mid -1;
            }
            else if (value == arr [mid])
                return  mid;
            else
                low = mid+ 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Arrays.sort(arr);
        System.out.println("ket qua " + Arrays.toString(arr));
        System.out.println(" hien thi " + timKiemGiaTri(arr,2));
        System.out.println(" hien thi " + timKiemGiaTri(arr,6));
        System.out.println(" hien thi " + timKiemGiaTri(arr,10));
    }
}

