package javaPractice;

public class CountVowelsInaString {
	// Count vowels in a given string.
	public static void main(String[] args) {
		String str = "Hello World, Welcome to Java Programming!";
		str = str.toLowerCase();
		int vowlCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowlCount++;
			}
		}
		System.out.println(vowlCount);
	}

}
