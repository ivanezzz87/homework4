package belhard.java28;

public class Main {

    public static void main(String[] args) {
	Rectangle rectangle1 = new Rectangle(5.0);
	Rectangle rectangle2 = new Rectangle(5.0, 6);
	Rectangle rectangle3 = new Rectangle(5.0, 3);
	rectangle1.PrintArea();
	rectangle2.PrintArea();
	rectangle3.PrintArea();
	rectangle1.PrintRectangleKind();
	rectangle2.PrintRectangleKind();
	rectangle3.PrintRectangleKind();
	System.out.println(rectangle1.IsTheSameRectangle(rectangle2));
	System.out.println(rectangle2.IsTheSameRectangle(rectangle2));
	System.out.println(rectangle3.IsTheSameRectangle(rectangle1));
    }
}
