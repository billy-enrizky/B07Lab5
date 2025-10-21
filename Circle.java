package B07lab5;

public class Circle {
	double radius;
	Point centre;
	public Circle(double r, Point c) {
		this.radius = r;
		this.centre = c;
	}
	public double area() {
		return Math.PI * radius * radius;	
	}
	public double perimeter() {
		return Math.PI * radius * 2;	
	}
	public boolean inside(Point a) {
		double dist = a.distance(this.centre);
		return dist <= this.radius;
	}
}
