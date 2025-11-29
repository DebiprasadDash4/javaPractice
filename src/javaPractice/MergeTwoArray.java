package javaPractice;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		int b[] = { 6, 7, 8, 9 ,10,18};

		int merge[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			merge[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			merge[a.length + i] = b[i];
		}

		System.out.println(Arrays.toString(merge));

	}

}
