package com.java.operators;

public class Operator {
	public static void main(String[] args) {
		int x = 4;
		int y = 8;
		int z = 12;

		int result = x + y;
		System.out.println("Sum: " + result);

		result = x - y;
		System.out.println("Odd: " + result);

		result = x * y;
		System.out.println("Multiplication: " + result);

		result = x / y;
		System.out.println("Division: " + result);

		result = x % y;
		System.out.println("Rest: " + result);

		result = z - x + y * (x / y);
		System.out.println("Inline operations result: " + result);
	}

}
