package pl.filipwlodarczyk.inheritance.ex4;

public class Point3D extends Point2D {
    int z;

    public Point3D() {

    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void printXandYandZ() {
        super.printXandY();
        System.out.print("z=" + z);
    }
}
