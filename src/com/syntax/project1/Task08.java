package com.syntax.project1;

public class Task08 {

	public static void main(String[] args) {

		// Maximum and minimum number in the array?

		int[] numbers = { 35, 78, 93, 54, 102, 40 };
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Largest element in array is = " + max);
		System.out.println("Smallest element in array is = " + min);

	}

}
