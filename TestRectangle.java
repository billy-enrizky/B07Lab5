package B07lab5;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
	@Test
	void widthBasic () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (1, 1));
		assertEquals(a.width(), 1, "Width Error.");
	}
	
	@Test
	void heightBasic () {
		Rectangle a = new Rectangle(new Point (10, 9), new Point (20, 4));
		assertEquals(a.height(), 5, "Height Error.");
	}
	
	@Test
	void areaBasic () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (1, 1));
		assertEquals(a.area(), 4, "Area Error.");
	}
	
	@Test
	void perimeterBasic () {
		Rectangle a = new Rectangle(new Point (1, 9), new Point (8, 0));
		assertEquals(a.perimeter(), 32, "Perimeter Error.");
	}
	
	@Test
	void isSquareTrue () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (5, 0));
		assertEquals(a.isSquare(), true, "isSquare returned false instead of true.");
	}
	
	@Test
	void isSquareFalse () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (5, 1));
		assertEquals(a.isSquare(), false, "isSquare returned true instead of false.");
	}
}
