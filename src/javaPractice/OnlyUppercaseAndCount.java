package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OnlyUppercaseAndCount {

	public static void main(String[] args) {

		String inputString = "SeleniumisbesBBt";

		char chararray[] = inputString.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < chararray.length; i++) {

			if (Character.isUpperCase(chararray[i])) {
				map.put(chararray[i], map.getOrDefault(chararray[i],0) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}
