package pl.filipwlodarczyk.inheritance.ex5;

public class Car {
    private Engine engine;

    public Car(Engine engine, String serialNumber) {
        this.engine = engine;
        this.engine.setSerialNumber(serialNumber);
    }

    public Engine getEngine() {
        return engine;
    }
}
