package javaPractice;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 10, 23, 45, 70, 11, 15 };
		int target = 70;
		int count = 0;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == target) {
				found = true;
				break;
			}

		}
		System.out.println(found +" At "+count+" Index ");

	}

}
