package pl.filipwlodarczyk.abstaction.ex5;

abstract class Searcher {

    abstract boolean compare(int a, int b);

    public int search(int array[], int elementOfArray) {

        for(int i = 0; i < array.length; i++) {
            if(array[i]==elementOfArray){
                return i;
            }
        } return -1;
    }
}
