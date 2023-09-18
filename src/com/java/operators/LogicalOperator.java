package com.java.operators;

public class LogicalOperator {
	public static void main(String[] args) {
//		Logical Operator => &&(AND) 
		int age = 51;
		boolean hasToVote = age >= 18 && age < 70;
		System.out.println(hasToVote + "\n");

//		Logical Operator => ||(OR)
		int yellowCard = 1, redCard = 2;
		boolean suspended = yellowCard == 1 || redCard == 2;
		System.out.println(suspended + "\n");

//		Logical Operator => ^(XOR - OR Exclusive)
		int x = 9, y = 11;
		boolean test = x < 10 ^ y > 10;
		System.out.println(test + "\n");

//		Logical Operator => !(NOT)
		int userAge = 20;
		boolean legalAge = !(userAge >= 21);
		System.out.println(legalAge);

	}

}
