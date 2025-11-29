package javaPractice;

public class CountPrefix {

	public static void main(String[] args) {
		String prefix = "happy";
		String[] test1 = { "happybirthday", "birthday", "happynew year" };
		int count = 0;

		for (int i = 0; i < test1.length; i++) {

			if (test1[i].startsWith(prefix)) {
				count++;
			}

		}
		System.out.println(count);

	}

}
