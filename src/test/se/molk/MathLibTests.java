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
	@Test
	public void testDivision() {
		double result = MathLib.divide(20, 2);
		double anotherResult = MathLib.divide(200, 25);
		double expected = 10;
		double unexpected = 1;

		assertEquals(expected, result, .00001);
		assertNotEquals(unexpected, anotherResult, .00001);
	}
	@Test
	public void testsquareRoot() {
		double result = MathLib.squareRoot(25);
		double anotherResult = MathLib.squareRoot(64);
		double expected = 5;
		double unexpected = 10;

		assertEquals(expected, result, .00001);
		assertNotEquals(unexpected, anotherResult, .00001);
	}

	@Test
	public void test_pi() {
		double result = MathLib.getPI();
		double expected = 3.141592653589793;

		assertEquals(expected, result, 0.00001);
	}
	@Test
	public void test_pi_add() {
		double result = MathLib.add(5, MathLib.getPI());
		double expected = 8.141592653589793;

		assertEquals(expected, result, 0.00001);
	}
	@Test
	public void test_pi_subtract() {
		double result = MathLib.subtract(8, MathLib.getPI());
		double expected = 4.858407346410207;

		assertEquals(expected, result, 0.00001);
	}
	@Test
	public void test_pi_divide() {
		double result = MathLib.divide(5, MathLib.getPI());
		double expected = 1.5915494309189535;

		assertEquals(expected, result, 0.00001);
	}
	@Test
	public void test_pi_multiply() {
		double result = MathLib.multiply(5, MathLib.getPI());
		double expected = 15.707963267948966;

		assertEquals(expected, result, 0.00001);
	}
	@Test
	public void test_pi_square() {
		double result = MathLib.squareRoot(MathLib.getPI());
		double expected = 1.7724538509055159;

		assertEquals(expected, result, 0.00001);
	}
	@Test
	public void test_pi_failed() {
		double result = MathLib.getPI();
		double expected = 3.14;

		assertEquals(expected, result, 0.00001);
	}

	@Test
	public void testMultiply(){
		double result = MathLib.multiply(5, 9);
		double anotherResult = MathLib.multiply(15, 10);
		double expected = 45;
		double unexpected = 10;

		assertEquals(expected, result, 0.00001);
		assertNotEquals(unexpected,anotherResult,0.00001);
	}

	@Test
	public void testExpressions() {
		// Order of operations is disregarded for now
		double result1 = MathLib.evaluateExpression("4 + 3");
		double result2 = MathLib.evaluateExpression("4 + 3 - 2");
		double result3 = MathLib.evaluateExpression("4 -3+ 2*5");
		double result4 = MathLib.evaluateExpression("1.1 + 2.2 + 3.3 - 4.4");
		double result5 = MathLib.evaluateExpression("-3 * 2");
		double result6 = MathLib.evaluateExpression("2 * -2 + 10");

		assertEquals(7, result1, 0.00001);
		assertEquals(5, result2, 0.00001);
		assertEquals(15, result3, 0.00001);
		assertEquals(2.2, result4, 0.00001);
		assertEquals(-6, result5, 0.00001);
		assertEquals(6, result6, 0.00001);
	}
}