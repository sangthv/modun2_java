package baitap.lop2DVa3D;

public class main {
    public static void main(String[] args) {
      lop2D d = new lop2D(2,3);
        System.out.println(d.toString());
       lop3D lop3D = new lop3D(3);
       lop3D.setX(d.getX());
        System.out.println(lop3D.toString());
    }
}
