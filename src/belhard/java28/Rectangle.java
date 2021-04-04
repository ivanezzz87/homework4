package belhard.java28;

public class Rectangle {
    private double x;
    private double y;
    private static int createRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle (double inX, double inY) {
        this.x = inX;
        this.y = inY;
        createRectangles++;
    }
    public Rectangle (double in) {
        this.x = in;
        this.y = in;
        createRectangles++;
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
    public static void  PrintRectanglesCount() {
        System.out.println("Всего было создано " + createRectangles + " прямоугольников");
    }
    public static void PrintClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }

}
