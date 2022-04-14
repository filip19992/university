package pl.filipwlodarczyk.inheritance.ex8;

public class Main {
    public static void main(String[] args) {
        MotorbikeSold motorbikeSold = new MotorbikeSold("Yamaha", "ZH-200");
        Motorbike motorbike = new Motorbike("Suzuki", "SpeedV2");

        System.out.println(motorbike.toString());

        motorbikeSold.setLicencsePlate("GA-S23FD");
        motorbikeSold.setSpeed(200);

        System.out.println(motorbikeSold.toString());
    }
}
