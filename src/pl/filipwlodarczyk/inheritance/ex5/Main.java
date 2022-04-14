package pl.filipwlodarczyk.inheritance.ex5;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine, "230043");

        String serialNumber = car.getEngine().getSerialNumber();
        System.out.println("Serial number of this car is: " + serialNumber);
    }
}
