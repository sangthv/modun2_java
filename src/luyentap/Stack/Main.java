package luyentap.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
//        stackChuoi.pop();     lay ra gia tri , xoa khoi stack
//        stackChuoi.peek();     lay ra gia tri , khong thay doi satck
//        stackChuoi.push(" nhap gia tri");  dua them vao gia tri
//        stackChuoi.clear();       xoa het khoi stack
//        stackChuoi.contains("giai tri"); xac dinh gia tri co ton tai stack khong
//        ddao nguoc chuoi
        System.out.println(" nhap vao chuoi: ");
        String s = sc.nextLine();
        for (int i = 0; i<s.length(); i++){
            stackChuoi.push(s.charAt(i) + "" );
        }
        System.out.println(" chuoi dao nguoc");
        for (int i = 0; i<s.length(); i++){
            System.out.print( stackChuoi.pop());
        }
        System.out.println();
//        chuyen doi tu thap phan sang nhi phan
        Stack <Integer> stackSoDu = new Stack<Integer>();
        System.out.println(" nhap 1 so nguyen duong tu ban phim");
        int x = sc.nextInt();
        while (x>0){
            int soDu = x%2;
            stackSoDu.push(soDu);
            x = x/2;
        }
        System.out.println("so nhi phan la : ");
        int n = stackSoDu.size();
        for(int i = 0; i<n; i++){
            System.out.print(stackSoDu.pop());
        }
    }
}
