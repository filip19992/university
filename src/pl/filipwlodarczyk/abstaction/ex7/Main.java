package pl.filipwlodarczyk.abstaction.ex7;

public class Main {
    public static void main(String[] args) {
        SpecificAudioSystem system = new SpecificAudioSystem();

        system.record();
        system.reproduce();
        system.reproduceRadio();
        system.switchOff();
    }
}
