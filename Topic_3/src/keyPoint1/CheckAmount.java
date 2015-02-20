package keyPoint1;

public class CheckAmount {
	private double amount;

	public CheckAmount(double d) {
		amount = d;
	}

	private String analizeOnes(int ones) {
		String result = "";
		switch (ones) {
		case 1:
			result = "one";
			break;
		case 2:
			result = "two";
			break;
		case 3:
			result = "three";
			break;
		case 4:
			result = "four";
			break;
		case 5:
			result = "five";
			break;
		case 6:
			result = "six";
			break;
		case 7:
			result = "seven";
			break;
		case 8:
			result = "eight";
			break;
		case 9:
			result = "nine";
			break;
		}
		return result;
	}

	private String analizeTens(int tens) {
		String result = "";
		if (tens < 20) {
			switch (tens) {
			case 10:
				result = "ten";
				break;
			case 11:
				result = "eleven";
				break;
			case 12:
				result = "twelve";
				break;
			case 13:
				result = "thirteen";
				break;
			case 14:
				result = "fourteen";
				break;
			case 15:
				result = "fifteen";
				break;
			case 16:
				result = "sixteen";
				break;
			case 17:
				result = "seventeen";
				break;
			case 18:
				result = "eighteen";
				break;
			case 19:
				result = "nineteen";
				break;
			default:
				result = analizeOnes(tens);
			}
		} else {
			int numberInTens = tens / 10;
			int numberInOnes = tens % 10;
			String onesString = "";
			switch (numberInTens) {
			case 2:
				result = "twenty";
				break;
			case 3:
				result = "thirty";
				break;
			case 4:
				result = "forty";
				break;
			case 5:
				result = "fifty";
				break;
			case 6:
				result = "sixty";
				break;
			case 7:
				result = "seventy";
				break;
			case 8:
				result = "eighty";
				break;
			case 9:
				result = "ninety";
				break;
			}
			onesString = analizeOnes(numberInOnes);
			if (!onesString.equals("")) {
				result = result.concat("-" + onesString);
			}
		}
		return result;
	}

	public String analizeHundreds(int hundreds) {
		int numberInHundreds = hundreds / 100;
		String result = "";
		String tensString = "";
		if (numberInHundreds != 0) {
			result = analizeOnes(numberInHundreds) + " hundred";
		}
		tensString = analizeTens(hundreds % 100);
		if (!tensString.equals("") && !result.equals("")) {
			result = result.concat(" ");
		}
		return result.concat(tensString);
	}

	private String connector(int cycle) {
		String result = "";
		switch (cycle) {
		case 1:
			result = " thousand";
			break;
		case 2:
			result = " million";
			break;
		}
		return result;
	}

	public String toText() {
		String result = "";
		String aux = "";
		int firstTwoDecimal;
		if (amount == 0) {
			result = "zero";
		} else {
			int integerPart;
			int hundreds;
			int cycle = 0;
			String partialResult = "";
			integerPart = (int) amount;

			while (integerPart != 0) {
				hundreds = integerPart % 1000;
				partialResult = analizeHundreds(hundreds);
				if (!partialResult.equals("")) {
					partialResult = partialResult.concat(connector(cycle));
				}
				if (!result.equals("") && !partialResult.equals("")) {
					result = " " + result;
				}
				result = partialResult + result;

				integerPart = integerPart / 1000;
				cycle++;
			}
		}
		firstTwoDecimal = (int) ((amount * 100f) % 100);

		aux = result.substring(0, 1).toUpperCase();
		return (aux + result.substring(1) + " and " + firstTwoDecimal + "/100 dollars");
	}

	public void set(double d) {
		amount = d;
	}
}
