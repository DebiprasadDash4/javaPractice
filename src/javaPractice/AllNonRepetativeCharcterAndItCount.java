package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class AllNonRepetativeCharcterAndItCount {
	//Print all non repetitive character in a given string.
	public static void main(String[] args) {
		String inputString = "iloveprograaming";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < inputString.length(); i++) {

			if (map.containsKey(inputString.charAt(i))) {
				map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
			} else {
				map.put(inputString.charAt(i), 1);
			}

		}
		//Only printing the key which have value as 1 .
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}

	}

}
