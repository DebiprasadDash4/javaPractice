package javaPractice;

public class PrintEvenOddInIntegerArray {
	//Print odd and even number from the given String array.
	public static void main(String[] args) {
		int arr[] = { 7, 5, 2, 9, 7, 8, 9, 6, 7, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
