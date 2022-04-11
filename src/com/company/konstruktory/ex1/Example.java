package com.company.konstruktory.ex1;

public class Example {
    int property;


    public Example() {
        this.property = 10;
    }

    public Example(int property) {
        this.property = property;
    }

    public void print() {
        System.out.println(property);
    }
}
