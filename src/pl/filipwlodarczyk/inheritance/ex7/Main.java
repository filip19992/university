package pl.filipwlodarczyk.inheritance.ex7;

public class Main {
    public static void main(String[] args) {
        SDCar car = new SDCar("GD-1S4F4");
        Car car2 = new Car("GSP-12AS3");

        car.turnSDOn();
        car2.turnOn();

        System.out.println(car.toString());
        System.out.println(car2.toString());


    }


}
