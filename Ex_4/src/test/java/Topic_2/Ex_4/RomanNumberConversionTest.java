package Topic_2.Ex_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberConversionTest {

	@Test
	public void convertUnitsToRoman() {
		RomanNumberConversion arabic = new RomanNumberConversion();
		String result = arabic.ArabicToRoman(8);
		assertEquals("VIII", result);
	}

	@Test
	public void convertTensToRoman() {
		RomanNumberConversion arabic = new RomanNumberConversion();
		String result = arabic.ArabicToRoman(12);
		assertEquals("XII", result);
	}

	@Test
	public void convertHundredsToRoman() {
		RomanNumberConversion arabic = new RomanNumberConversion();
		String result = arabic.ArabicToRoman(379);
		assertEquals("CCCLXXIX", result);
	}

	@Test
	public void convertThousandsToRoman() {
		RomanNumberConversion arabic = new RomanNumberConversion();
		String result = arabic.ArabicToRoman(3999);
		assertEquals("MMMCMXCIX", result);
	}

	@Test
	public void convertUnitsToArabic() {
		RomanNumberConversion roman = new RomanNumberConversion();
		int result = roman.RomanToArabic("III");
		assertEquals(3, result);
	}

	@Test
	public void convertTensToArabic() {
		RomanNumberConversion roman = new RomanNumberConversion();
		int result = roman.RomanToArabic("LXIV");
		assertEquals(64, result);
	}

	@Test
	public void convertHundredsToArabic() {
		RomanNumberConversion roman = new RomanNumberConversion();
		int result = roman.RomanToArabic("DCCCXCIX");
		assertEquals(899, result);
	}

	@Test
	public void convertThousandsToArabic() {
		RomanNumberConversion roman = new RomanNumberConversion();
		int result = roman.RomanToArabic("MCCCXXV");
		assertEquals(1325, result);
	}

}
