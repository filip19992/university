package com.company.konstruktory.ex2;

public class Line {
    Point beggining;
    Point end;

    public Line(Point beggining, Point end) {
        this.beggining = beggining;
        this.end = end;
    }

    public Line(int firstX, int firstY, int secondX, int secondY) {
        this.beggining =new Point(firstX,firstY);
        this.end =new Point(secondX,secondY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "beggining=" + beggining +
                ", end=" + end +
                '}';
    }
}
