package javaPractice;

public class CalculateFactorialOfGivenNumber {
	//Calculate factorial of given number 
	public static void main(String[] args) {
		int number = 5;
		int temp = 1;

		for (int i = 1; i <= number; i++) {

			temp = i * temp;

		}
		System.out.println(temp);

	}

}
