package Topic_3.main.Exercise_4;

public class RomanConverter {

	private static final int MAX_ROMAN = 3999;

	private static String[][] romans = { { "I", "V", "X" }, { "X", "L", "C" }, { "C", "D", "M" }, { "M", "", "" } };

	private enum RomanToInt{
		I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

		private int number;

		RomanToInt(int number){
			this.number = number;
		}
	}

	public String intToRoman(int integer) {
		if (integer > MAX_ROMAN)
			return "Integer is too big.";

		String result = "";

		// Get integer length
		int integerLength = ((int) Math.log10(integer)) + 1;

		// For each digit
		for (int i = integerLength - 1; i >= 0; i--){
			// Get digit
			int intInPos = getDigitInPos(integer, i);

			// Add roman representation to result
			result += integerToRoman(intInPos, i);
		}

		return result;
	}

	public int romanToInt(String roman){
		int result = 0;

		// Get chars in pairs, if first is less than second subtract it, otherwise sum it
		for (int i = 0; i < roman.length() - 1; i++) {
			int current = romanToInteger(roman.charAt(i));
			int next = romanToInteger(roman.charAt(i + 1));

			result += sign(current - next) * current;
		}

		// Sum the last number
		result += romanToInteger(roman.charAt(roman.length() - 1));

		return result;
	}

	private int getDigitInPos(int integer, int i) {
		return (integer % (int) Math.pow(10, i + 1)) / (int) Math.pow(10, i);
	}

	private String integerToRoman(int number, int power) {
		// Special case
		if (number == 4)
			return romans[power][0] + romans[power][1];

		// Special case
		if (number == 9)
			return romans[power][0] + romans[power][2];

		// Get additive representation
		String result = number >= 5 ? romans[power][1] : "";

		for (int i = 0; i < number % 5; i++)
			result += romans[power][0];

		return result;
	}

	private int romanToInteger(char roman) {
		return RomanToInt.valueOf(String.valueOf(roman)).number;
	}

	private int sign(int number) {
		return number >= 0 ? 1 : -1;
	}
}
