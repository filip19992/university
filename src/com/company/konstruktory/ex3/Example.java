package com.company.konstruktory.ex3;

public class Example {
    double firstField;
    double secondField;

    public void print() {
        System.out.println("First field " + firstField + " " + "second field: " + secondField);
    }

    public Example() {
        this.firstField = 0;
        this.secondField = 0;
    }

    public Example(double secondField) {
        this.firstField = secondField;
        this.secondField = 0;
    }

    public Example(double firstField, double secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }
}
