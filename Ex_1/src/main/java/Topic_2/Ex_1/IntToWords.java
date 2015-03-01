package Topic_2.Ex_1;

public class IntToWords {

	private static final String[] tensNames = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	private static final String[] numNames = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public IntToWords() {

	}

	private String getDecimalPart(float number) {
		String aux = String.format("%.2f", number);
		String toReturn = aux.substring(aux.length() - 2, aux.length());
		return toReturn += "/100 dollars";
	}

	public String convert(float number) {
		String decimalPart = getDecimalPart(number);
		String integerPart = "";
		if (number < 100)
			integerPart = lessThanHundreds((int) number);
		else if (number < 1000)
			integerPart = lessThanThousands((int) number);
		else if (number < 1000000)
			integerPart = lessThanMillons((int) number);
		else
			return "This program can't convert this number.";
		integerPart = integerPart.replaceFirst(integerPart.substring(0, 1), integerPart.substring(0, 1).toUpperCase());
		return integerPart + " and " + decimalPart;
	}

	private String lessThanHundreds(int number) {
		if (number < 20)
			return numNames[number];
		String tens = tensNames[number / 10];
		String units = "";
		if (number % 10 != 0)
			units = numNames[number % 10];
		return tens + "-" + units;
	}

	private String lessThanThousands(int number) {
		String lHundred = "";
		if (number % 100 != 0)
			lHundred = lessThanHundreds(number % 100);
		return numNames[number / 100] + " hundred " + lHundred;
	}

	private String lessThanMillons(int number) {
		String lThousands = "";
		if (number % 1000 != 0)
			lThousands = lessThanThousands(number % 1000);
		String thousands = "";
		if (number / 1000 < 100)
			thousands = lessThanHundreds(number / 1000);
		else
			thousands = lessThanThousands(number / 1000);
		return thousands + " thousand " + lThousands;
	}

}
