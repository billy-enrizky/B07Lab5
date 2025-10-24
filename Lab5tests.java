package B07lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab5tests {

	@Test
	void perimeterBasic() {
		Circle a = new Circle(5,new Point(0,0));
		assertEquals(a.perimeter(),10*Math.PI,"Perimeter Error.");
	}
	
	@Test
	void areaBasic() {
		Circle a = new Circle(5,new Point(100,200));
		assertEquals(a.area(),25*Math.PI,"Area Error.");
	}
	
	@Test
	void insideCaseTrue() {
		Circle a = new Circle(10,new Point(0,0));
		Point b = new Point(8,6);
		assertEquals(a.inside(b),true,"Inside doesn't return true when its supposed to.");
	}
	
	@Test
	void insideCaseFalse() {
		Circle a = new Circle(10,new Point(0,0));
		Point b = new Point(18,0);
		assertEquals(a.inside(b),false,"Inside doesn't return false when its supposed to.");
	}
	
}
