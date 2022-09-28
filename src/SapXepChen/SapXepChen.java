package SapXepChen;

import java.util.Arrays;

public class SapXepChen {
    private static Object sapX;

    public static void sapXepChen (int [] list){
        for (int i = 1; i <list.length ; i++) {
            int giaTriHienTai = list[i];
            int k;
            for ( k = i-1; k >= 0 && list[k] > giaTriHienTai ; k--) {
                list[k+ 1] = list [k];
            }
            list[k+1] = giaTriHienTai;
        }
    }

    public static void main(String[] args) {
        int [] x = {1,4,6,3,2,9,7,5,6};
       sapXepChen(x);
        System.out.println(" sap xep " + Arrays.toString(x));
    }
}
