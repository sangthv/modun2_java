package thuchanh.statics;

public class TestStaticMeThod {
    public static void main(String[] args) {
        students.change();
        students s1 = new students(111, "hoang");
        students s2 = new students(222, "long");
        s1.display();
        s2.display();
    }
}
