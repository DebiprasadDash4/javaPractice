package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicatStringInAArray {
	//Find Duplicate word and its count in a given array of string
	public static void main(String[] args) {

		String arr[] = { "Hi", "Hello", "you", "I", "Hi" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			
			else {
				map.put(arr[i], 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}

	}

}
