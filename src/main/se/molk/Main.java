package se.molk;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Welcome to the best calculator!");
		scanner = new Scanner(System.in);
		input_value();
	}

	public static void input_value() {
		while (true) {
			System.out.println("Input expression: ");

			String input = scanner.next();

			System.out.println(MathLib.evaluateExpression(input));
			System.out.println();
		}
	}
}