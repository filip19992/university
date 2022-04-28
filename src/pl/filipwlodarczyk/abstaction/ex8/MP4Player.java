package pl.filipwlodarczyk.abstaction.ex8;

public class MP4Player implements VideoPlayerI{
    @Override
    public void play(String fileName) {
        System.out.printf("%s in mp4 format is playing", fileName);
    }
}
