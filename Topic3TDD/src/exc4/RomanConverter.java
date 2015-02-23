package exc4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanConverter {

	protected static Map<String, Integer> numbers;
	protected static Map<Integer, String> numbers2;

	static {
		numbers = new HashMap<String, Integer>();
		numbers.put("I", 1);
		numbers.put("IV", 4);
		numbers.put("V", 5);
		numbers.put("IX", 9);
		numbers.put("X", 10);
		numbers.put("XL", 40);
		numbers.put("L", 50);
		numbers.put("XC", 90);
		numbers.put("C", 100);
		numbers.put("CD", 400);
		numbers.put("D", 500);
		numbers.put("CM", 900);
		numbers.put("M", 1000);
	}

	static {
		numbers2 = new HashMap<Integer, String>();
		numbers2.put(1, "I");
		numbers2.put(4, "IV");
		numbers2.put(5, "V");
		numbers2.put(9, "IX");
		numbers2.put(10, "X");
		numbers2.put(40, "XL");
		numbers2.put(50, "L");
		numbers2.put(90, "XC");
		numbers2.put(100, "C");
		numbers2.put(400, "CD");
		numbers2.put(500, "D");
		numbers2.put(900, "CM");
		numbers2.put(1000, "M");
	}

	public static String intToRoman(Integer number) {
		String roman = "";
		List<Integer> list = new ArrayList<Integer>(numbers.values());
		Collections.sort(list);
		Collections.reverse(list);

		Integer N = number;
		for (Integer i : list) {
			while (N >= i) {
				roman += numbers2.get(i);
				N -= i;
			}
		}

		return roman;
	}

	public static Integer romanToInt(String romanNumber) {
		if (romanNumber.length() > 1) {
			Integer sum = 0;
			Integer previous = null;

			for (int i = 0; i < romanNumber.length(); i++) {
				Integer actual = numbers.get("" + romanNumber.charAt(i));

				if (previous == null)
					previous = actual;
				if (previous < actual)
					sum -= 2 * previous;
				previous = actual;
				sum += actual;
			}

			return sum;
		}

		return numbers.get(romanNumber);
	}

}
