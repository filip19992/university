package pl.filipwlodarczyk.inheritance.ex4;

public class Point2D {
    int x;
    int y;

    public Point2D() {
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void printXandY() {
        System.out.println("x=" + x +
                " y=" + y);
    }

}
