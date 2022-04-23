package pl.filipwlodarczyk.abstaction.ex5;

import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {

        int[] numbers ={1,30,50,2,70};

        int searchedNumber = 1;

        EqualsSearcher equalsSearcher = new EqualsSearcher();

        System.out.println(
                "Element you are looking for is on index nuber: " + equalsSearcher.search(numbers,searchedNumber)
        );
    }
}
