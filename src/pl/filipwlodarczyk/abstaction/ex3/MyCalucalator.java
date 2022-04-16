package pl.filipwlodarczyk.abstaction.ex3;

public class MyCalucalator implements Calculator{

    @Override
    public double add(int a, int b) {
        return a+b;
    }

    @Override
    public double subtract(int a, int b) {
        return a-b;
    }

    public double sinus(int a, int b) {
        return a/b;
    }
}
