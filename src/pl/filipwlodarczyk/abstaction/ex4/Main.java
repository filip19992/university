package pl.filipwlodarczyk.abstaction.ex4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        Square square = new Square(2);

        System.out.println(rectangle.countPerimeter());
        System.out.println(rectangle.countSurface());
        System.out.println(square.countPerimeter());
        System.out.println(square.countSurface());
    }
}
