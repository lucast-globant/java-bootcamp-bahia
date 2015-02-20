package topic3.key4;

public class Converter {
	
	private static int[] ARABIC_DIGITS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static String[] ROMAN_DIGITS = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
	
	public static String convert (int arabic) {
		String roman = "";
	    for (int i = 0; i < ARABIC_DIGITS.length; i++) {
	    	while (arabic >= ARABIC_DIGITS[i]) {
	    		roman += ROMAN_DIGITS[i];
	            arabic -= ARABIC_DIGITS[i];
	        }
	    }
	    return roman;
	 }

	private static int romanIndex (String romanDigit) {
		int i = 0; 
		boolean flag = i < ROMAN_DIGITS.length;
		while (flag) {
			if (romanDigit.equals(ROMAN_DIGITS[i])) {
				flag = false; 
			} else {
				flag = (++i < ROMAN_DIGITS.length);
			}
		}
		return i;
	}
	
	public static int convertRomanToArabic (String roman) {
		int arabic = 0;
		boolean flag = !roman.equals("");
		while (flag) {
			if (roman.length() > 1) {
				if (romanIndex(""+roman.charAt(0)) > romanIndex(""+roman.charAt(1))) {
					arabic-= ARABIC_DIGITS[romanIndex(""+roman.charAt(0))];
				}else {
					arabic+= ARABIC_DIGITS[romanIndex(""+roman.charAt(0))];
				}
			}else {
				arabic+= ARABIC_DIGITS[romanIndex(""+roman.charAt(0))];
			}
			roman = roman.substring(1);
			flag = !roman.equals("");
		}
	    return arabic;
	}
}
