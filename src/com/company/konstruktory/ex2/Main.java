package com.company.konstruktory.ex2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Point point2 = new Point(5, 2);
        System.out.println(point.toString());

        Line line = new Line(5,4,6,2);
        Line line2 = new Line(point, point2);

        System.out.println("  ");
        System.out.println(line);
        System.out.println(line2.toString());
    }
}
