package javaPractice;

import java.util.Arrays;

public class MoveZeroToStart {

	public static void main(String[] args) {
		int arr[] = { 10, 0, 20, 0, 40, 0, 50, 0 };
		int newarr[] = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(counter);
			if (arr[i] == 0) {    // We are first pushing zero to new array
				newarr[counter] = arr[i];
				counter++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {		// pushing non zero to new array
				newarr[counter] = arr[i];
				counter++;
			}
		}

		System.out.println(Arrays.toString(newarr));
	}

}
