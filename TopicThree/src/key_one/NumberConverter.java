package key_one;

public class NumberConverter {

	private double number;
	private static final String[] tensNames = { "", "ten", "twenty-",
			"thirty-", "forty-", "fifty-", "sixty-", "seventy-", "eighty-",
			"ninety-" };
	private static final String[] numNames = { "", "one ", "two ", "three ",
			"four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ",
			"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ",
			"sixteen ", "seventeen ", "eighteen ", "nineteen " };

	public NumberConverter(double number) {
		this.number = number;
	}

	public String toAppropiateText() {
		int intNumber = (int) number;
		// Require input from 0.00 to 9999.99
		if (intNumber == 0) {
			return "zero " + convertDecimals();
		}
		if (intNumber < 1000) {
			if (intNumber < 100) {
				if (intNumber > 19) {
					return tensNames[intNumber / 10] + numNames[intNumber % 10]
							+ convertDecimals();
				} else {
					return numNames[intNumber] + convertDecimals();
				}
			} else {
				return numNames[intNumber / 100] + "hundred "
						+ tensNames[(intNumber / 10) % 10]
						+ numNames[intNumber % 10] + convertDecimals();
			}
		} else {
			String hundred = "";
			if ((intNumber / 100) % 10 > 0) {
				hundred = numNames[(intNumber / 100) % 10] + "hundred ";
			}
			return numNames[intNumber / 1000] + "thousand " + hundred
					+ tensNames[(intNumber / 10) % 10]
					+ numNames[intNumber % 10] + convertDecimals();
		}

	}

	private String convertDecimals() {
		int firstDecimal = (int) ((number * 10) % 10);
		int secondDecimal = (int) ((number * 100) % 10);
		String decimals = firstDecimal + "" + secondDecimal;
		return "and " + decimals + "/100 dollars";
	}
}
