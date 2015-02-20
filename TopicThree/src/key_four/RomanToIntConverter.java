package key_four;

public class RomanToIntConverter {

	private final int num;
	private static final int[] numbers = { 1000, 900, 500, 400, 100, 90, 50,
			40, 10, 9, 5, 4, 1 };
	private static final String[] letters = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" };

	public RomanToIntConverter(String roman) {
		if (roman.length() == 0)
			throw new NumberFormatException(
					"An empty string does not define a Roman number.");
		roman = roman.toUpperCase();
		int i = 0;
		int integer = 0;
		while (i < roman.length()) {
			char letter = roman.charAt(i);
			int number = letterToNumber(letter);
			i++;
			if (i == roman.length()) {
				integer += number;
			} else {
				int nextNumber = letterToNumber(roman.charAt(i));
				if (nextNumber > number) {
					integer += (nextNumber - number);
					i++;
				} else {
					integer += number;
				}
			}
		}
		if (integer > 3999)
			throw new NumberFormatException(
					"Roman number must have value 3999 or less.");
		num = integer;
	}

	public RomanToIntConverter(int integer) {
		if (integer < 1)
			throw new NumberFormatException(
					"Value of RomanNumber must be positive.");
		if (integer > 3999)
			throw new NumberFormatException(
					"Value of RomanNumber must be 3999 or less.");
		num = integer;
	}

	private int letterToNumber(char letter) {
		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			throw new NumberFormatException("Illegal character \"" + letter
					+ "\" in Roman number");
		}
	}

	public String getRomanRepresentation() {
		String roman = "";
		int N = num;
		for (int i = 0; i < numbers.length; i++) {
			while (N >= numbers[i]) {
				roman += letters[i];
				N -= numbers[i];
			}
		}
		return roman;
	}

	public int getIntRepresentation() {
		return num;
	}
}
