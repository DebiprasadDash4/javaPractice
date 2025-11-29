package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharaterAndCount {

	public static void main(String[] args) {
		String inputString = "Seleniumisbest";

		Map<Character, Integer> map = new HashMap<>();
		char words[] = inputString.toCharArray();

		for (char word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}

	}

}
