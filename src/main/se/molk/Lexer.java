package se.molk;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Lexer {
	enum TokenType {
		NUMBER("\\d+(\\.\\d+)?"),
		OPERATOR("[/*^+-]");

		private final String pattern;

		TokenType(String s) {
			pattern = s;
		}

	}

	static class Token {
		public TokenType type;
		public String data;

		public Token(TokenType type, String data) {
			this.type = type;
			this.data = data;
		}
	}

	private static Pattern tokenPatterns;

	static {
		StringBuilder bob = new StringBuilder();

		for (TokenType tokenType : TokenType.values()) {
			bob.append(String.format("(?<%s>%s)|", tokenType.name(), tokenType.pattern));
		}

		bob.setLength(bob.length() - 1);

		tokenPatterns = Pattern.compile(bob.toString());
	}

	private static ArrayList<Token> parseExpression(String expression) {
		ArrayList<Token> tokens = new ArrayList<>();

		Matcher matcher = tokenPatterns.matcher(expression);

		while (matcher.find()) {
			for (TokenType tokenType : TokenType.values()) {
				if (matcher.group(tokenType.name()) != null) {
					tokens.add(new Token(
						tokenType,
						matcher.group(tokenType.name())
					));
				}
			}
		}

		return tokens;
	}

	public static double evaluateExpression(String expression) {
		ArrayList<Token> tokens = parseExpression(expression);

		double result = Double.NaN;
		String operator = "";

		boolean makeNextNegative = false;

		for (Token token : tokens) {
			switch (token.type) {
				case NUMBER:
					if (Double.isNaN(result)) {
						result = Double.parseDouble(token.data);
					} else {
						double num = Double.parseDouble(token.data);

						if (makeNextNegative) {
							num = -num;
							makeNextNegative = false;
						}

						switch (operator) {
							case "+":
								result = MathLib.add(result, num);
								break;
							case "-":
								result = MathLib.subtract(result, num);
								break;
							case "*":
								result = MathLib.multiply(result, num);
								break;
							case "/":
								result = MathLib.divide(result, num);
								break;
						}

						operator = "";
					}
					break;
				case OPERATOR:
					if (Double.isNaN(result)) {
						result = 0;
					}

					if (operator.equals("")) {
						operator = token.data;
					} else if (token.data.equals("-")) {
						makeNextNegative = true;
					}

					break;
			}
		}

		return result;
	}
}
