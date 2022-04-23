package pl.filipwlodarczyk.abstaction.ex6;

public class ExampleClass implements ExampleInterface, OtherInterface{
    @Override
    public void exampleMethod() {
        System.out.println("Method from example interface");
    }

    @Override
    public void otherInterfaceMethod() {
        System.out.println("Method from other interface");
    }
}
