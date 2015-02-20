package exc1;

public class NumberConverter {

	private static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	private static final String[] tens = { "", // 0
			"", // 1
			"twenty", // 2
			"thirty", // 3
			"forty", // 4
			"fifty", // 5
			"sixty", // 6
			"seventy", // 7
			"eighty", // 8
			"ninety" // 9
	};

	private String convert(int n) {
		if (n < 0) {
			return "minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		if (n < 1000000) {
			return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
		}

		if (n < 1000000000) {
			return convert(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
		}

		return convert(n / 1000000000) + " billion" + ((n % 1000000000 != 0) ? " " : "") + convert(n % 1000000000);
	}

	public String maskConverter(int n) {
		String result = convert(n);
		result = result + addAfterComma(n);
		return result + " dollars";

	}

	private String commaNumbers(double number) {
		String s = String.valueOf(number);
		String[] result = s.split("\\.");
		return result[1];
	}

	private String addAfterComma(double number) {
		String commaNumber = commaNumbers(number);
		if (!commaNumber.equals("0")) {
			commaNumber = " and " + commaNumber;
			commaNumber += "\100";
			return commaNumber;
		} else
			return "";
	}

}
