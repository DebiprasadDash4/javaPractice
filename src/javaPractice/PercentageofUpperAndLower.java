package javaPractice;

public class PercentageofUpperAndLower {

	public static void main(String[] args) {
		String inputString = "iLoveprogramming@123456#";
		int length = inputString.length();

		int lower = 0, upper = 0, digit = 0, specialchar = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				specialchar++;
			}
		}

		double percetUpper = (upper * 100) / length;
		double percetLower = (lower * 100) / length;
		double percetDigit = (digit * 100) / length;
		double percetSpecil = (specialchar * 100) / length;
		System.out.println(percetUpper);
		System.out.println(percetLower);
		System.out.println(percetDigit);
		System.out.println(percetSpecil);

	}

}
