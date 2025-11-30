package javaPractice;

public class FindMissingNumberInaArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		int totalcount = 5;
		//Target sum-actual sum gives us the value which is missing in the array 
		//target sum formula is n(n+1)/2 , where n is total count . n should be in the range like in our 
		//Example array it is in range of 5.
		int targetSum = totalcount * ((totalcount + 1) / 2);
		int actualsum=0;

		for (int i = 0; i < a.length; i++) {
			actualsum+=a[i];
		}
		
		int missingNumber=targetSum-actualsum;
		System.out.println(missingNumber);

	}

}
