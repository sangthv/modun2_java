package lythuyet.SapXepNoIBot;

import java.util.Arrays;

public class SapXepNoiBot {
    public static void sapXepNBot(int [] array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = array.length -1; j>i; j--){ //
                if(array[j]<array[j-1]){
                    int temp = array [j];
                    array[j] = array[j-1];
                    array [j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] x = {1,3,4,2,8,45,23,12,13};
        sapXepNBot(x);
        System.out.println(" sap xep " + Arrays.toString(x));
    }
}
