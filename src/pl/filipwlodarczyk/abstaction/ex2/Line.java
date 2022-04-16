package pl.filipwlodarczyk.abstaction.ex2;

public class Line extends Graphic{
    @Override
    void draw() {
        System.out.printf("Rysuj Linie od (%d, %d) do (%d, %d) %n", x1, y1, x2, y2 );
    }
}
