package thuchanh.statics;

public class students {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

public students(int r, String n) {
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "DH ha noi";
    }
    void display(){
        System.out.println( rollno + " " + name + " " + college);
    }
}
