package pl.filipwlodarczyk.abstaction.ex8;

public class AviPlayer implements VideoPlayerI{
    @Override
    public void play(String fileName) {
        System.out.printf("%s in avi format is playing", fileName);
    }


}
