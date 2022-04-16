package pl.filipwlodarczyk.abstaction.ex2;

public class Main {
    public static void main(String[] args) {
        drawUtils(3,2,6,1,new Line());
        drawUtils(2,1,2,3,new Line());
    }

    static void drawUtils(int x1, int y1, int x2, int y2, Graphic g) {
       g.setBeggining(x1,y1);
       g.setEnd(x2,y2);
       g.draw();
    }
}
