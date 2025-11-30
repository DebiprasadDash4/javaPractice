package javaPractice;

import java.util.Random;

public class GenerateRandomNumber {
	//Generate random number
	public static void main(String[] args) {
		Random random=new Random();
		System.out.println(random.nextInt(10000));
		System.out.println(random.nextBoolean());
		

	}

}
