package pl.filipwlodarczyk.abstaction.ex8;

public class Main {
    public static void main(String[] args) {
        FormatChecker formatChecker = new FormatChecker();

        String fileName = "sample.mp3";

        try {
            VideoPlayerI videoPlayerI = formatChecker.checkFormat(fileName);
            if(videoPlayerI != null) {
                videoPlayerI.play(fileName);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
