package lythuyet.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Dqueue {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("hoa");
        danhSachSV.offer("lan");
        danhSachSV.offer("hong");
        danhSachSV.offer("phuong");
        danhSachSV.offerLast("hoa3");
        danhSachSV.offerFirst("hoa0");

        while (true){
            String ten = danhSachSV.poll();
            if(ten== null){
                break;
            }
            System.out.println(ten);
        }

    }
}
