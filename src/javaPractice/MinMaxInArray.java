package javaPractice;

public class MinMaxInArray {

	public static void main(String[] args) {

		int[] numbers = { 55, 32, 45, 98, 82, 11, 9, 39, 50 };

		// Initialize smallest and largest to the first element
		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			
			if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		
		System.out.println("smallest- "+smallest);
		System.out.println("largest- "+largest);

	}

}
