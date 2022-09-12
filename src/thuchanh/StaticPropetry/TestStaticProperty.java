package thuchanh.StaticPropetry;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3" , "skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("mazda 6 ", " skysactiv 6 ");
        System.out.println(Car.numberOfCar);
    }
}
