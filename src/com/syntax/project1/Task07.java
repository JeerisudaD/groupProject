package com.syntax.project1;

public class Task07 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */

		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < 10; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}

	}

}
