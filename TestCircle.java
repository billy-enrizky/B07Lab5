package B07lab5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCircle {
	
	@Test
	void testAreaBasic() {
		Circle c = new Circle(5.0, new Point(0, 0));
		double expected = Math.PI * 5.0 * 5.0;
		assertEquals(expected, c.area(), 0.0001, "an area calculation error.");
	}
	
	@Test
	void testPerimeterBasic() {
		Circle c = new Circle(3.0, new Point(0, 0));
		double expected = Math.PI * 3.0 * 2;
		assertEquals(expected, c.perimeter(), 0.0001, "an perimeter calculation error.");
	}
	
	@Test
	void testInsidePointAtCentre() {
		Circle c = new Circle(5.0, new Point(0, 0));
		Point p = new Point(0, 0);
		assertTrue(c.inside(p), "the point at centre should be inside circle.");
	}
	
	@Test
	void testInsidePointInside() {
		Circle c = new Circle(5.0, new Point(0, 0));
		Point p = new Point(3, 0);
		assertTrue(c.inside(p), "the point inside circle should return true.");
	}
	
	@Test
	void testInsidePointOnBoundary() {
		Circle c = new Circle(5.0, new Point(0, 0));
		Point p = new Point(5, 0);
		assertTrue(c.inside(p), "the point on boundary should be considered inside.");
	}
	
	@Test
	void testInsidePointOutside() {
		Circle c = new Circle(5.0, new Point(0, 0));
		Point p = new Point(6, 0);
		assertFalse(c.inside(p), "the point outside circle should return false.");
	}
	
	@Test
	void testInsidePointFarAway() {
		Circle c = new Circle(2.0, new Point(0, 0));
		Point p = new Point(10, 10);
		assertFalse(c.inside(p), "the point far away should return false.");
	}
	
	@Test
	void testAreaWithZeroRadius() {
		Circle c = new Circle(0.0, new Point(0, 0));
		assertEquals(0.0, c.area(), 0.0001, "the circle  with radius 0 should have area 0.");
	}
	
	@Test
	void testPerimeterWithZeroRadius() {
		Circle c = new Circle(0.0, new Point(0, 0));
		assertEquals(0.0, c.perimeter(), 0.0001, "the circle with radius 0 should have perimeter 0.");
	}
	
	@Test
	void testInsideWithOffsetCentre() {
		Circle c = new Circle(3.0, new Point(5, 5));
		Point p = new Point(7, 7);
		assertTrue(c.inside(p), "the point inside theoffset circle should return true.");
	}
}
