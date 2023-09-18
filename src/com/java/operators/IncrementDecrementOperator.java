package com.java.operators;

public class IncrementDecrementOperator {

	public static void main(String[] args) {

		int x = 10;
		x++;
		x = x + 1;
		++x;
		System.out.println("Increment result: " + x);

		int y = 10;
		y--;
		y = y - 1;
		--y;
		System.out.println("Decrement result: " + y + "\n");

		int z = 5, w = 10, a = 10;
		z = w++;
		System.out.println("Result increment z: " + z);
		System.out.println("Result increment w: " + w);
		
		
		z = --a;
		System.out.println("Result decrement z: " + z);
		System.out.println("Result decrement a: " + a);

	}

}
