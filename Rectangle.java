package lab4;

public class Rectangle {
	Point topLeft;
	Point bottomRight;
	
	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	
	public double width() {
		return Math.abs(bottomRight.x - topLeft.x);
	}
	
	public double height() {
		return Math.abs(topLeft.y - bottomRight.y);
	}
	
	public double area() {
		return width() * height();
	}
	
	public double perimeter() {
		return 2 * (width() + height());
	}
	
	public boolean isSquare() {
		return width() == height();
	}
}
