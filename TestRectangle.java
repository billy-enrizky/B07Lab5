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
		Rectangle a = new Rectangle(new Point (0, 5), new Point (1, 1));
		assertEquals(a.height(), 4, "Height Error.");
	}
	
	@Test
	void areaBasic () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (1, 1));
		assertEquals(a.area(), 4, "Area Error.");
	}
	
	@Test
	void perimeterBasic () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (1, 1));
		assertEquals(a.perimeter(), 10, "Perimeter Error.");
	}
	
	@Test
	void isSquareTrue () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (5, 0));
		assertEquals(a.isSquare(), true, "Square Error.");
	}
	
	@Test
	void isSquareFalse () {
		Rectangle a = new Rectangle(new Point (0, 5), new Point (5, 1));
		assertEquals(a.isSquare(), false, "Square Error.");
	}
}
