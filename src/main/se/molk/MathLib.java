package se.molk;

public final class MathLib {
	public static double add(double x, double y) {
		return x + y;
	}

	public static double subtract(double x, double y) {
		return x-y;
	}

	public static double divide(double x, double y) {
		return x / y;
	}

	public static double multiply(double x, double y) {
		return x*y;
	}

	public static double squareRoot(double x) {
		return Math.pow(x, 0.5);
	}

	public static double getPI() {
		return Math.PI;
	}

	public static double evaluateExpression(String s) {
		return Lexer.evaluateExpression(s);
	}
}
