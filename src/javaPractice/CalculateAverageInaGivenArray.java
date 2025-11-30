package javaPractice;

public class CalculateAverageInaGivenArray {
	//Average in a given array
	public static void main(String[] args) {
		int input[] = { 7, 45, 8, 7, 2, 5, 7, 1, 4 };
		int average = 0;
		int temp = 0;

		for (int i = 0; i < input.length; i++) {

			temp = temp + input[i];
		}
		average=temp/input.length;

		System.out.println("Average " + average);

	}

}
