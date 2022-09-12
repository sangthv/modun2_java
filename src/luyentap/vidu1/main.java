package luyentap.vidu1;

public class main {
    public static int tong(){
        int[] arr = new int[]{1, 2, 3, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        tong();
        System.out.println("ket qua " + tong());
    }
}
