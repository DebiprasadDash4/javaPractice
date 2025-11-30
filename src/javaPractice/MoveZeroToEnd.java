package javaPractice;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {

		int arr[] = { 10, 0, 20, 0, 40, 0, 50, 0 };
		int newarr[] = new int[arr.length];
		int count=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newarr[count] = arr[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(newarr));

	}

}
