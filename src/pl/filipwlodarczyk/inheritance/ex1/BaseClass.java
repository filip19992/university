package pl.filipwlodarczyk.inheritance.ex1;

public class BaseClass {


    public String showTextFunction() {
        return "function from " + this.getClass().getName();
    }

    public void showTextProcedure() {
        System.out.println("prodecure from " + this.getClass().getName());
    }
}
