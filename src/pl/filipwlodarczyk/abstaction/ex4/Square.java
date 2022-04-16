package pl.filipwlodarczyk.abstaction.ex4;

public class Square implements Shape{
    private final double side;

    protected Square(double side) {
        this.side = side;
    }

    @Override
    public double countSurface() {
        return side*side;
    }

    @Override
    public double countPerimeter() {
        return 4*side;
    }
}
