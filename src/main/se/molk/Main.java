package se.molk;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the best calculator!");
		input_value();
	}

	public static void input_value(){
		Scanner sc = new Scanner(System.in);
		System.out.println("what do you want to calculate?: ");
		System.out.println("1: + ");
		System.out.println("2: - ");
		System.out.println("3: / ");
		System.out.println("4: * ");
		System.out.println("5: square");

		int choose = sc.nextInt();
		switch(choose){
			case(1):
				System.out.println("add: input two numbers: ");
				System.out.print("first:");
				double input_one = sc.nextDouble();
				System.out.print("second:");
				double input_two = sc.nextDouble();
				System.out.println("result:" + MathLib.add(input_one,input_two));
				break;
			case(2):
				System.out.println("subtract: input two numbers: ");
				System.out.print("first:");
				input_one = sc.nextDouble();
				System.out.print("second:");
				input_two = sc.nextDouble();
				System.out.println("result:" + MathLib.subtract(input_one,input_two));
				break;
			case(3):
				System.out.println("divide: input two numbers: ");
				System.out.print("first:");
				input_one = sc.nextDouble();
				System.out.print("second:");
				input_two = sc.nextDouble();
				System.out.println("result:" + MathLib.divide(input_one,input_two));
				break;
			case(4):
				System.out.println("multiply: input two numbers: ");
				System.out.print("first:");
				input_one = sc.nextDouble();
				System.out.print("second:");
				input_two = sc.nextDouble();
				System.out.println("result:" + MathLib.multiply(input_one,input_two));
				break;
			case(5):
				System.out.println("square root: input number to calculate: ");
				System.out.print("first:");
				input_one = sc.nextDouble();
				System.out.println("result:" + MathLib.squareRoot(input_one));
				break;
		}
	}
}