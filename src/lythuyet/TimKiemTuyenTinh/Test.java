package lythuyet.TimKiemTuyenTinh;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] x = new int[]{1,3,5,7,2,4};
        System.out.println("gia tri " + Arrays.toString(x));
        System.out.println(" x la "+ Main.timKiem(x,3));
    }
}
