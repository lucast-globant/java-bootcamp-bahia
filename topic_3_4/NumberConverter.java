package topic_3_4;

import java.util.HashMap;
import java.util.Map;

public class NumberConverter {

	public NumberConverter() {}

	public int romanToInt (String roman) {

		int index = 0;
		int number = 0;
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("",0);
		map.put("I",1);
		map.put("V",5);
		map.put("X",10);
		map.put("L",50);
		map.put("C",100);
		map.put("D",500);
		map.put("M",1000);

		while (index < roman.length()) {

			char letter = roman.charAt(index);  // Letter at current position in string.
			int digit = map.get(""+letter);	    // Numerical equivalent of letter.

			index++;  // Move on to next position in the string

			if (index == roman.length()) {
				number += digit;
			}
			else {
				int nextNumber = map.get(""+roman.charAt(index));
				if (nextNumber > digit) {
					// Combine the two letters to get one value, and move on to next position in string.
					number += (nextNumber - digit);
					index++;
				}
				else {
					// Don't combine the letters.  Just add the value of the one letter onto the number.
					number += digit;
				}
			}
		}
		return number;
	}

	public String intToRoman(int num) {
		String roman = "";

		String onesArray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String tensArray[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String hundredsArray[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

		int ones = num % 10; // Get the ones in the number to convert

		num = (num - ones) / 10;
		int tens = num % 10; // Get the tens in the number to convert

		num = (num - tens) / 10;
		int hundreds = num % 10; // Get the hundreds in the number to convert

		// Get the thousands in the number and start to convert the number
		num = (num - hundreds) / 10;
		for (int i = 0; i < num; i++)
			roman += "M";

		if (hundreds >= 1)
			roman += hundredsArray[hundreds - 1];

		if (tens >= 1)
			roman += tensArray[tens - 1];

		if (ones >= 1)
			roman += onesArray[ones - 1];

		return roman;
	}
}