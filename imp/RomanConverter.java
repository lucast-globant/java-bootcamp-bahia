package imp;

public class RomanConverter {
	
	private static final String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
	private static final String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	private static final String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	private static final String[] thousands = { "", "M", "MM", "MMM" };

	public int RomanToArabic(String roman) {
		int index = 0;
		int arabic = 0;
		int current = 0;
		int last = 0;
		while (index < roman.length()) {
			if (roman.charAt(index) == 'I')
				current = 1;
			if (roman.charAt(index) == 'V')
				current = 5;
			if (roman.charAt(index) == 'X')
				current = 10;
			if (roman.charAt(index) == 'L')
				current = 50;
			if (roman.charAt(index) == 'C')
				current = 100;
			if (roman.charAt(index) == 'D')
				current = 500;
			if (roman.charAt(index) == 'M')
				current = 1000;
			if ((last < current) && (last != 0)) {
				current -= last;
				arabic -= last;
				arabic += current;
			} else {
				last = current;
				arabic += current;
			}
			index++;
		}
		return arabic;
	}

	public String ArabicToRoman(int arabic) {
		if (arabic >= 4000)
			return "Out of range";
		String roman = "";
		if (arabic >= 1000) {
			roman += thousands[arabic / 1000];
			arabic = arabic % 1000;
		}
		if (arabic >= 100) {
			roman += hundreds[arabic / 100];
			arabic = arabic % 100;
		}
		if (arabic >= 10) {
			roman += tens[arabic / 10];
			arabic = arabic % 10;
		}
		if (arabic != 0) {
			roman += units[arabic];
		}
		return roman;
	}
}
