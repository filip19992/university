package pl.filipwlodarczyk.abstaction.ex11;

public class Main {
    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek", 5);

        Dog sharik = new Dog("Sharik", 2);

        mruczek.speak();
        sharik.speak();
    }
}
