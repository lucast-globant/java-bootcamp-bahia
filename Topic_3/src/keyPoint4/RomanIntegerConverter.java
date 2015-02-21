package keyPoint4;

public class RomanIntegerConverter {

	private String symbolByPosition(int symbol, int pos) {
		int caseVariable = pos * 10 + symbol;
		String result = "";
		switch (caseVariable) {
		case 1:
			result = "I";
			break;
		case 5:
			result = "V";
			break;
		case 10:
		case 11:
			result = "X";
			break;
		case 15:
			result = "L";
			break;
		case 20:
		case 21:
			result = "C";
			break;
		case 25:
			result = "D";
			break;
		case 30:
		case 31:
			result = "M";
			break;
		}
		return result;
	}

	private String romanDigit(int i, int position) {
		String result = "";
		switch (i) {
		case 0:
			break;
		case 3:
			result = symbolByPosition(1, position);
		case 2:
			result = result + symbolByPosition(1, position);
		case 1:
			result = result + symbolByPosition(1, position);
			break;
		case 4:
			result = symbolByPosition(1, position)
					+ symbolByPosition(5, position);
			break;
		case 9:
			result = symbolByPosition(1, position)
					+ symbolByPosition(10, position);
			break;
		default:
			result = symbolByPosition(5, position)
					+ romanDigit(i - 5, position);
		}
		return result;
	}

	public String toRoman(int i) {
		String result = "";
		int cycle = 0;
		while (i != 0) {
			result = romanDigit(i % 10, cycle) + result;
			i = i / 10;
			cycle++;
		}
		return result;
	}

	public int toInt(String string) {
		int result = 0;
		int actualValue, lastValue = 0;
		for (int i = string.length() - 1; i >= 0; i--) {
			actualValue = valueOfSymbol(string.charAt(i));
			if (actualValue < lastValue) {
				result -= actualValue;
			} else {
				result += actualValue;
			}
			lastValue = actualValue;
		}
		return result;
	}

	private int valueOfSymbol(char charAt) {
		int result = 0;
		switch (charAt) {
		case 'I':
			result = 1;
			break;
		case 'V':
			result = 5;
			break;
		case 'X':
			result = 10;
			break;
		case 'L':
			result = 50;
			break;
		case 'C':
			result = 100;
			break;
		case 'D':
			result = 500;
			break;
		case 'M':
			result = 1000;
			break;
		}
		return result;
	}
}
