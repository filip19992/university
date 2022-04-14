package pl.filipwlodarczyk.constructors.ex3;

public class Main {
    public static void main(String[] args) {
        Example przyklad = new Example();
        Example przyklad2 = new Example(3);
        Example przyklad3 = new Example(2,5);

        przyklad.print();
        przyklad2.print();
        przyklad3.print();
    }
}
