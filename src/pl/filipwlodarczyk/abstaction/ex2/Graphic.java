package pl.filipwlodarczyk.abstaction.ex2;

abstract class Graphic {
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;

    public void setBeggining(int x, int y) {
        x1=x;
        y1=y;
    }
    public void setEnd(int x, int y) {
        x2=x;
        y2=y;
    }

    abstract void draw();

}
