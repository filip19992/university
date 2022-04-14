package pl.filipwlodarczyk.inheritance.ex1;

public class Main {
    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        LowerClass lc = new LowerClass();

        System.out.println(bc.showTextFunction());
        bc.showTextProcedure();

        System.out.println(lc.showTextFunction());
        lc.showTextProcedure();


    }
}
