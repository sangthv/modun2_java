package thuchanh.TimMinMaxmang;

public class Main {
    public static void main(String[] args) {
        int []  number = new int[] {1,5,7,6,5,8,1,4};
        int max = number[0];
        int min =number[0];
       for( int i=0; i<number.length; i++){
           if(max<number[i]){
               max=number[i];
           }
           if(min>number[i]){
               min=number[i];
           }
       }
        System.out.println("giá trị lớn nhất " + max);
        System.out.println("giá trị nhỏ nhất " + min);
    }
}
