package lythuyet.Queue;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new java.util.PriorityQueue<String>();

        danhSachSV.offer("hoa");
        danhSachSV.offer("lan");
        danhSachSV.offer("hong");
        danhSachSV.offer("phuong");
        while (true) {
            String ten = danhSachSV.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
