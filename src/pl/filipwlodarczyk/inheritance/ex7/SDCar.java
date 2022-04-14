package pl.filipwlodarczyk.inheritance.ex7;

public class SDCar extends Car {
    private boolean isSelfDriving = false;

    public void turnSDOn() {
        isSelfDriving = true;
    }

    public void turnSDOff() {
        isSelfDriving = false;
    }

    public SDCar(String liceansePlate) {
        super(liceansePlate);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "," +
                "isSelfDriving=" + isSelfDriving +
                '}';
    }
}
