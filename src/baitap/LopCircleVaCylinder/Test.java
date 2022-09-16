package baitap.LopCircleVaCylinder;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(5,"xanh");
        System.out.println(circle.toString());
        System.out.println("dien tich hinh tron " +circle.DienTich());
        cylinder cylinder = new cylinder(5,"do",3);
        System.out.println("the tich hinh tru: " + cylinder.TheTich());

    }

    }
