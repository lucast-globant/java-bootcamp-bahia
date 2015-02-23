package imp;

public class Converter {

	private static final String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private static final String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public String getWords(float num) {
		String decimals = this.calculateDecimal(num);
		String integers = "";
		if (num < 100) {
			integers = getIntegersMin100((int) num);
		} else if (num < 1000) {
			integers = getIntegersMin1000((int) num);
		} else if (num < 1000000) {
			integers = getIntegersMin1000000((int) num);
		} else
			return "This program doesn't have that money";

		integers = integers.replaceFirst(integers.substring(0, 1), integers.substring(0, 1).toUpperCase());
		return integers + " and " + decimals;
	}

	private String getIntegersMin1000000(int num) {
		String ret = "";
		String t = "";
		if (num % 1000 != 0)
			ret = getIntegersMin1000(num % 1000);

		if (num / 1000 < 100)
			t = getIntegersMin100(num / 1000);
		else
			t = getIntegersMin1000(num / 1000);
		return t + " thousand " + ret;
	}

	private String getIntegersMin1000(int num) {
		String ret = "";
		if (num % 100 != 0)
			ret = getIntegersMin100(num % 100);
		return numbers[num / 100] + " hundred " + ret;
	}

	private String getIntegersMin100(int num) {
		if (num < 20)
			return numbers[num];
		String ten = tens[num % 10];
		String units = "";
		if (num % 10 != 0)
			units = numbers[num % 10];
		return ten + "-" + units;
	}

	private String calculateDecimal(float num) {
		String ret = String.format("%.2f", num);
		return ret.substring(ret.length() - 2, ret.length()) + "/100 dollars";
	}

}
