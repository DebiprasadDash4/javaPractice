package javaPractice;

public class CountEvenOddInAArray {

	public static void main(String[] args) {
		int input[] = { 7, 45, 8, 7, 2, 5, 7, 1, 4 };

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even count : " + evenCount + "  Odd Count : " + oddCount);

	}

}
