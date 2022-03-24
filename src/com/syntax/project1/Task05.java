package com.syntax.project1;

public class Task05 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?

				int a = 2022;
				int b = 2021;
				 
				System.out.println("Before swapping variable: " + "a = " + a + ", b = " + b);
				
				a = a * b; // 2022(a) * 2021(b) = 4,086,462
				b = a / b; // 4,086,462(a) / 2021(b) = 2022
				a = a / b; // 4,086,462(a) / 2022(b) = 2021
				
				System.out.println();
				System.out.println("After swapping variable: " + "a = " + a +", b = " + b);
			}
		
	}

