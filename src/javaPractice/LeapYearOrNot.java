package javaPractice;

public class LeapYearOrNot {

	public static void main(String[] args) {
		//year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
		int year = 1700;
		boolean leapYear = false;
		if (year % 100 == 0 && year % 400 == 0) {
			leapYear = true;
		}

		else if (year % 4 == 0) {
			leapYear = true;
		}
		
		System.out.println(leapYear);
	}

}
