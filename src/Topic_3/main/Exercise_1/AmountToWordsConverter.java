package Topic_3.main.Exercise_1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AmountToWordsConverter {

	// Numbers to nineteen
	private static String[] numbersTo19 = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	// Name of positions each of 3 digits in short scale standard
	private static String[] positionNames = { "", "thousand", "million", "billion", "trillion" };

	// Name of tens to be compounded with numbers from 1 to 10
	private static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public String getInWords(BigDecimal number) {

		// Get decimal and integer part
		int decimals = number.multiply(new BigDecimal(100)).remainder(new BigDecimal(100)).intValue();
		BigInteger integer = number.toBigInteger();

		// Result buffers
		String result = "";
		String integerResult = "";
		String decimalResult = String.format("%02d/100 dollars", decimals);

		// If there's no integer part, return decimal
		if (integer.intValue() == 0)
			return decimalResult;

		// Get integer in words
		integerResult = getIntegerInWords(integer, integerResult);

		// Append decimals
		result += integerResult + "and " + decimalResult;

		// Capitalize the result
		result = capitalizeFirstLetter(result);

		return result;
	}

	private String getIntegerInWords(BigInteger integer, String integerInWords) {
		// For each named position calculate hundreds and append position name
		for (int i = positionNames.length - 1; i >= 0; i--) {
			String positional = positionNames[i];

			// Get hundreds of current named position eg. for thousands of 134.932.834 get 932
			BigInteger pow_i_plus_1 = new BigInteger("10").pow(3 * (i + 1));
			BigInteger pow_i = new BigInteger("10").pow(3 * i);
			BigInteger remainder = integer.remainder(pow_i_plus_1);

			int hundredsOfPosition = remainder.divide(pow_i).intValue();

			// Get the hundreds in words and append positional
			integerInWords += getHundredsInWords(hundredsOfPosition, positional);
		}
		return integerInWords;
	}

	private String getHundredsInWords(int number, String positional) {
		String result = "";

		if (number == 0)
			return "";

		// Get hundreds and last two digits eg. for 138, hundreds = 1, lastTwoDigits = 38
		int hundreds = number / 100;
		int lastTwoDigits = number % 100;

		// Append hundreds in words
		result += hundreds > 0 ? numbersTo19[hundreds] + " hundred " : "";

		// Append last digits in words
		result += lastTwoDigits > 19 ? getTens(number) + " " : (lastTwoDigits == 0 ? "" : numbersTo19[number % 100] + " ");

		// Append positional name
		result += positional == "" ? "" : positional + " ";

		return result;
	}

	private String getTens(int number) {
		String result = "";

		// Get tens name
		result += tens[number % 100 / 10];

		// Append second digit if it exists
		if (number % 10 != 0)
			result += "-" + numbersTo19[number % 10];

		return result;
	}

	private String capitalizeFirstLetter(String string) {

		if (string.length() == 0)
			return "";

		return string.substring(0, 1).toUpperCase() + string.substring(1);
	}
}
