package pl.filipwlodarczyk.inheritance.ex4;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,3,5);
        Point2D point2D = new Point2D(1,3);

        point2D.printXandY();
        point3D.printXandYandZ();
    }
}
