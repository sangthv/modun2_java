package lythuyet.phuongThucToSting;

public class ToString {
    private int day;
    private int month;
    private int year;

    public ToString() {
    }

    public ToString(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public  void printDay(){
        System.out.println(" day: " + this.day);
    }
    public  void printMonth(){
        System.out.println(" thang: " + this.month);
    }
    public  void printYear(){
        System.out.println(" nam: " + this.year);
    }
}

