package pl.filipwlodarczyk.abstaction.ex4;

public class Rectangle implements Shape{

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double countSurface() {
        return sideA*sideB;
    }

    @Override
    public double countPerimeter() {
        return 2*sideA+2*sideB;
    }
}
