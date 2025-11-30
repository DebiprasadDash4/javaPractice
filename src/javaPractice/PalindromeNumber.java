package javaPractice;

public class PalindromeNumber {
	
	
	//Palindrome -Number which is equal to it's reverse is called as a palindrome number like 121 ,1331
	//Here we have to reverse the number and then have compare with the input number.

	public static void main(String[] args) {
		int number = 1331;
		int input = number;
		int var = 0;
		
		//Logic to reverse a number
		while (number > 0) {
			int digit = number % 10;
			var = var * 10 + digit; 
			number = number / 10;
		}

		System.out.println(var);

		if (input == var) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

	}

}
