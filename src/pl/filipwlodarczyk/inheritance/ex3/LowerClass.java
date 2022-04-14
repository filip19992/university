package pl.filipwlodarczyk.inheritance.ex3;

public class LowerClass extends BaseClass{
    public String helloWorld() {
        return super.sayHello() + "world!";
    }
}
