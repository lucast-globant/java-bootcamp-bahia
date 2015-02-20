package com.aguirre.classes;

public class Converter {

	private static Converter instance = null;

	private String[] numNames;
	private String[] tensNames;
	private String[] bigNumbers;

	private Converter() {
		numNames = new String[20];
		numNames[0] = "";
		numNames[1] = "one";
		numNames[2] = "two";
		numNames[3] = "three";
		numNames[4] = "four";
		numNames[5] = "five";
		numNames[6] = "six";
		numNames[7] = "seven";
		numNames[8] = "eight";
		numNames[9] = "nine";
		numNames[10] = "ten";
		numNames[11] = "eleven";
		numNames[12] = "twelve";
		numNames[13] = "thirteen";
		numNames[14] = "fourteen";
		numNames[15] = "fifteen";
		numNames[16] = "sixteen";
		numNames[17] = "seventeen";
		numNames[18] = "eighteen";
		numNames[19] = "nineteen";

		tensNames = new String[10];
		tensNames[0] = "";
		tensNames[1] = "ten";
		tensNames[2] = "twenty";
		tensNames[3] = "thirty";
		tensNames[4] = "forty";
		tensNames[5] = "fifty";
		tensNames[6] = "sixty";
		tensNames[7] = "seventy";
		tensNames[8] = "eighty";
		tensNames[9] = "ninety";

		bigNumbers = new String[2];
		bigNumbers[0] = "thousand";
		bigNumbers[1] = "million";
	}

	public static Converter getInstance() {
		if (instance == null) {
			instance = new Converter();
		}
		return instance;
	}

	public String convert(double amount) {
		String text = "";
		String num = String.format("%.2f", amount);
		// decimal part of the number
		text = extractPennies(num);
		// integer part of the amount
		num = num.substring(0, num.length() - 3);

		int integerPart = Integer.parseInt(num);
		// if the amount is between 0.00 and 0.99 dollars
		if (integerPart == 0) {
			if (text.equals("dollars")) {
				text = "zero " + text;
			}
			return text;
		}

		if (!text.equals("dollars")) {
			text = "and " + text;
		}

		// if the amount is between 1.00 dollars and 999.99 dollars
		if (integerPart <= 999) {
			text = convertUntil999(integerPart) + " " + text;
			return text;
		}

		// if the amount is bigger than 999999.99
		if (integerPart >= 1000000) {
			System.out.println("The amount is too big, it has to be between 0.00 and 999999.99 ");
		}

		// the amount is between 1000.00 and 999999.00
		String result = "";
		int t = 0;
		while (integerPart > 0) {
			String aux = convertUntil999(integerPart % 1000);

			if (integerPart / 1000 != 0) {
				if (!aux.equals("")) {
					aux = " " + aux;
				}
				result = " " + bigNumbers[t] + aux + result;
				t++;
			} else {
				result = aux + result;
			}

			integerPart = integerPart / 1000;
		}

		text = result + " " + text;

		return text;
	}

	private String convertUntil999(int number) {
		String result = "";
		int hundreds = number / 100;
		if (hundreds > 0) {
			result += numNames[hundreds] + " hundred";
			if (number % 100 != 0) {
				result = result + " ";
			}
		}
		result += convertUntil99(number % 100);
		return result;
	}

	private String convertUntil99(int number) {
		String result = "";
		if (number < 20) {
			result += numNames[number];
			return result;
		}
		int tens = number / 10;
		int units = number % 10;
		result += tensNames[tens];
		if (units > 0) {
			result += "-" + numNames[units];
		}
		return result;
	}

	private String extractPennies(String num) {
		String pennies = num.substring(num.length() - 2, num.length());
		if ("00".equals(pennies)) {
			return "dollars";
		}
		return pennies + "/100 dollars";
	}
}
