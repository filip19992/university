package pl.filipwlodarczyk.abstaction.ex10;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", true, 5);
        Rectangle rectangle = new Rectangle("blue", true, 5, 6);
        Square square = new Square();

        System.out.println(circle.getArea());
    }
}
