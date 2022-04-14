package pl.filipwlodarczyk.inheritance.ex8;

public class MotorbikeSold extends Motorbike{
    private double speed = 0.0;
    private String licencsePlate;

    public MotorbikeSold(String brand,
                         String model,
                         double maxspeed,
                         boolean antitheft,
                         double speed,
                         String licencsePlate) {
        super(brand,model,maxspeed,antitheft);
        this.speed = speed;
        this.licencsePlate = licencsePlate;
    }

    public MotorbikeSold(String brand, String model) {
        super(brand,model);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicencsePlate() {
        return licencsePlate;
    }

    public void setLicencsePlate(String licencsePlate) {
        this.licencsePlate = licencsePlate;
    }

    @Override
    public String toString() {
        return "MotorbikeSold{" +
                "speed=" + speed +
                ", licencsePlate='" + licencsePlate + '\'' +
                "} " + super.toString();
    }
}
