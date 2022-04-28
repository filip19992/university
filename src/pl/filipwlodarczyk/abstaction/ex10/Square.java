package pl.filipwlodarczyk.abstaction.ex10;

public class Square extends Rectangle{

    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled,side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
