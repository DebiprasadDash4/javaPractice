package javaPractice;
public class BubbleSort {

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
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}

}
