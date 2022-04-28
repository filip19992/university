package pl.filipwlodarczyk.abstaction.ex8;

public class FormatChecker {


    private final MP4Player mp4Player = new MP4Player();
    private final AviPlayer aviPlayer = new AviPlayer();


    public VideoPlayerI checkFormat(String fileName) throws IllegalAccessException, InstantiationException {
        if(fileName.endsWith(".mp4")) {
          return mp4Player;
        } else if (fileName.endsWith(".avi")) {
            return aviPlayer;
        } else {
            return null;
        }
    }
}
