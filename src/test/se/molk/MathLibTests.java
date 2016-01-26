package se.molk;

import org.junit.Test;

import static org.junit.Assert.*;

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
    public void test_subtraction(){
        MathLib calc = new MathLib();
        double result = calc.subtract(1,5);
        double expected = -4;
        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void test_subtraction_failed(){
        MathLib calc = new MathLib();
        double result = calc.subtract(1,5);
        double expected = 4;
        assertEquals(expected, result, 0.00001);
    }
}