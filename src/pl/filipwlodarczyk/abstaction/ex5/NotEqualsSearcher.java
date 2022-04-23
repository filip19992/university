package pl.filipwlodarczyk.abstaction.ex5;

public class NotEqualsSearcher extends Searcher{
    @Override
    boolean compare(int a, int b) {
        return a != b;
    }
}
