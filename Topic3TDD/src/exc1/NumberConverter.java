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

	public String maskConverter(double amount) {
		String text = " ";
		String resu = "";
		String num = String.format("%.2f", amount);

		text = decimalPart(num);

		num = num.substring(0, num.length() - 3);

		int integerPart = Integer.parseInt(num);

		if (integerPart == 0) {
			if (text.equals("dollars")) {
				text = "zero " + text;
			}
			return text;
		}

		if (!text.equals("dollars")) {
			text = "and " + text;
		}

		resu += convert(integerPart);

		return resu + " " + text;

	}

	private String decimalPart(String num) {

		String decimal = num.substring(num.length() - 2, num.length());

		if ("00".equals(decimal)) {
			return "dollars";
		}
		return decimal + "/100 dollars";

	}
}
