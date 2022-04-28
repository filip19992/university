package pl.filipwlodarczyk.abstaction.ex9;

public class Searcher implements Checker {

    public int search(int a[], int ele, Checker checker) {
        for(int i=0; i < a.length; i++) {
            if ( check(a[i], ele))
            {
                return i;
            }
        } return -1;
    }

    @Override
    public boolean check(int a, int b) {
        return a > b;
    }
}
