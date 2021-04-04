package belhard.java28;

public class Rectangle {
    private double x;
    private double y;

    public Rectangle (double inX, double inY) {
        this.x = inX;
        this.y = inY;
    }
    public Rectangle (double in) {
        this.x = in;
        this.y = in;
    }
    public double CalculatedArea () {
        return x*y;
    }
    public void PrintArea () {
        System.out.println(this.CalculatedArea());
    }
    public void PrintRectangleKind () {
        if (this.x == this.y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public boolean IsTheSameRectangle (Rectangle inRectangle) {
        if (inRectangle.getX() == this.x && inRectangle.getY() == this.y) {
            return true;
        } else {return false;}
    }
}
