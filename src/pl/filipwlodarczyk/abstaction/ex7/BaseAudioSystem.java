package pl.filipwlodarczyk.abstaction.ex7;

abstract public class BaseAudioSystem implements AudioSystem, RadioReproducer {

    @Override
    public void record() {
        System.out.println("Recording started");
    }

    @Override
    public void reproduce() {
        System.out.println("Reproducing started");
    }
}
