package baitap.HinhTron;

public class HinhTron {
    private double radius = 3.0;
    private String color = " red ";

    public HinhTron() {
    }

    public HinhTron(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double HinhTron(){
        return radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        double area;
        area = this.radius * this.radius * Math.PI;
        return area;
    }
    public void display(){
        System.out.println("ban kinh la " + this.radius + " mau" +this.color);
        System.out.println(" dien tich la " + getArea());
    }
}
