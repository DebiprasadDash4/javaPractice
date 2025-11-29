package javaPractice;

public class CheckNumberIsBinaryOrNot {

	public static void main(String[] args) {

		int number = 10111;
		boolean isBinary = true;

		while (number > 0) {
			int temp = number % 10;

			if (temp > 1) {
				isBinary = false;
				break;
			} else {
				number = number / 10;
			}
		}

		System.out.println(isBinary);

	}

}
