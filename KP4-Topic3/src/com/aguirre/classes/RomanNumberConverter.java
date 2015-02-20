package com.aguirre.classes;

public class RomanNumberConverter {

	private static RomanNumberConverter instance = null;
	private String onesLetters[] = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
	private String tensLetters[] = { "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	private String hundredsLetters[] = { "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };

	private RomanNumberConverter() {
	}

	public static RomanNumberConverter getInstance() {
		if (instance == null) {
			instance = new RomanNumberConverter();
		}
		return instance;
	}

	public int converToInt(String number) {
		int decimal = 0;
		int lastDigit = 0;
		int currentDigit = 0;
		int digit;
		for (int i = 0; i < number.length(); i++) {
			digit = number.charAt(i);
			switch (digit) {
			case 'I': {
				currentDigit = 1;
				break;
			}
			case 'V': {
				currentDigit = 5;
				break;
			}
			case 'X': {
				currentDigit = 10;
				break;
			}
			case 'L': {
				currentDigit = 50;
				break;
			}
			case 'C': {
				currentDigit = 100;
				break;
			}
			case 'D': {
				currentDigit = 500;
				break;
			}
			case 'M': {
				currentDigit = 1000;
				break;
			}
			}

			// If lastDigit is smaller than currentDigit, we subtract
			// the lastDigit from the currentDigit.
			// Otherwise, we just add the currentDigit.

			if ((lastDigit < currentDigit) && (lastDigit != 0)) {
				currentDigit -= lastDigit;
				decimal -= lastDigit;
				decimal += currentDigit;
				lastDigit = currentDigit;
				currentDigit = 0;
			} else {
				lastDigit = currentDigit;
				decimal += currentDigit;
				currentDigit = 0;
			}
		}
		return decimal;
	}

	public String converToRomanNumber(int number) {
		String roman = "";

		for (int i = 0; i < (number / 1000); i++) {
			roman += "M";
		}

		int ones = number % 10;
		number = (number - ones) / 10;
		int tens = number % 10;
		number = (number - tens) / 10;
		int hundreds = number % 10;

		if (hundreds >= 1) {
			roman += hundredsLetters[hundreds - 1];
		}

		if (tens >= 1) {
			roman += tensLetters[tens - 1];
		}

		if (ones >= 1) {
			roman += onesLetters[ones - 1];
		}
		return roman;
	}
}
