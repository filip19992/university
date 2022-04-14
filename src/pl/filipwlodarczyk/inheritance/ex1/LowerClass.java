package pl.filipwlodarczyk.inheritance.ex1;

public class LowerClass extends BaseClass{
    @Override
    public String showTextFunction() {
        return super.showTextFunction();
    }

    @Override
    public void showTextProcedure() {
        super.showTextProcedure();
    }
}
