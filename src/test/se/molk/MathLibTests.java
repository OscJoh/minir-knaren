package se.molk;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathLibTests {
	@Test
	public void testAddition() {
		assertEquals(1, 0);
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

