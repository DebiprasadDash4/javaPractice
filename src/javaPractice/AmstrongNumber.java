package javaPractice;

public class AmstrongNumber {
	//An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the total number of digits in the number.
	public static void main(String[] args) {
		//Check Amstrong Number
		int number = 1534;

		// Calculate length of the number

		int temp = number;
		int length = 0;
		int sum = 0;
		while (temp > 0) {
			length++;
			temp = temp / 10;
		}
		
		temp = number;
		while (temp > 0) {
			int digit = temp % 10;
			sum = (int) (sum+Math.pow(digit, length));
			temp = temp / 10;

		}
		
		System.out.println(sum);
		if (sum==number) {
			System.out.println("amstrong number");
		}

	}

}
