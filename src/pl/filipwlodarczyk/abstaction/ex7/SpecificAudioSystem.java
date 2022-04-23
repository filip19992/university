package pl.filipwlodarczyk.abstaction.ex7;

public class SpecificAudioSystem extends BaseAudioSystem{
    @Override
    public void reproduceRadio() {
        System.out.println("Reproduce radio");
    }


    public void switchOff() {
        System.out.println("Switched off!");
    }
}
