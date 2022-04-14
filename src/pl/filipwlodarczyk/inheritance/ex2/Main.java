package pl.filipwlodarczyk.inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        StatisticCalculator sc = new StatisticCalculator();

        System.out.println(calculator.add(2,3));
        System.out.println(calculator.less(2,1));
        System.out.println(sc.add(2,3));
        System.out.println(sc.sinus(4,2));
    }
}
