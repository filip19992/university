package pl.filipwlodarczyk.constructors.ex4;

public class Main {
    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();

        overloadingExample.print(3);
        overloadingExample.print(3.5);
        overloadingExample.print("Hi!:)");
    }
}
