package pl.filipwlodarczyk.inheritance.ex7;

public class Car {

    private boolean isOn = false;
    private String liceansePlate;

    public Car() {
    }

    public Car(String liceansePlate) {
        this.liceansePlate = liceansePlate;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isOn=" + isOn +
                ", liceansePlate='" + liceansePlate + '\'' +
                '}';
    }
}
