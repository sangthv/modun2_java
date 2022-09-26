package lythuyet.Mang;

import java.util.Arrays;

public class Test {
    public static int[] daoNguoc(int[] x) {
        int[] rs = new int[x.length];
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            rs[index] = x[i];
            index++;
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 2, 5, 7, 8, 5, 9};
        int[] b = new int[10];

        System.out.println("a " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(" a sau khi sx " + Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(b, -1));
        Arrays.fill(b, 5);
        System.out.println(" mang b " + Arrays.toString(b));

        Arrays.sort(a);
        a = Test.daoNguoc(a);
        System.out.println(" a sau khi sx giam dan" + Arrays.toString(a));
    }
}
