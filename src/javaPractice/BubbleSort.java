package javaPractice;

import java.util.Arrays;

public class BubbleSort {
	//Bubble sort
	//Comparing the array element at n and n+1 and swaping it which is bigger.
	public static void main(String[] args) {
		int input[] = { 7, 3, 58, 9, 6, 7, 52 };

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		
//		for (int i = 0; i < input.length; i++) {
//			System.out.println(input[i]);
//		}
		
		System.out.println(Arrays.toString(input));
		System.out.println("Second largest"+input[input.length-2]);

	}

}
