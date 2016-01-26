package se.molk;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathLibTests {

	@Test
	public void testAddition() {
		double result = MathLib.add(18, 24);
		double anotherResult = MathLib.add(1214, 123);

		double expected = 42;
		double unexpected = 1;

		assertEquals(expected, result, .00001);
		assertNotEquals(unexpected, anotherResult, .00001);
	}

	@Test
	public void testDivision() {
		double result = MathLib.divide(20, 2);
		double anotherResult = MathLib.divide(200, 25);

				double expected = 10;
				double unexpected = 1;

		assertEquals(expected, result, .00001);
		assertNotEquals(unexpected, anotherResult, .00001);
	}
}
