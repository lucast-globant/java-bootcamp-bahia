package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import imp.RomanConverter;

public class RomanTest {
	@Test
	public void check_units_to_roman() {
		RomanConverter arabic = new RomanConverter();
		String result = arabic.ArabicToRoman(5);
		assertEquals("V", result);
	}

	@Test
	public void check_tens_to_roman() {
		RomanConverter arabic = new RomanConverter();
		String result = arabic.ArabicToRoman(14);
		assertEquals("XIV", result);
	}

	@Test
	public void check_hundreds_to_roman() {
		RomanConverter arabic = new RomanConverter();
		String result = arabic.ArabicToRoman(444);
		assertEquals("CDXLIV", result);
	}

	@Test
	public void check_thousands_to_roman() {
		RomanConverter arabic = new RomanConverter();
		String result = arabic.ArabicToRoman(3897);
		assertEquals("MMMDCCCXCVII", result);
	}

	@Test
	public void check_units_to_arabic() {
		RomanConverter roman = new RomanConverter();
		int result = roman.RomanToArabic("V");
		assertEquals(5, result);
	}

	@Test
	public void check_tens_to_arabic() {
		RomanConverter roman = new RomanConverter();
		int result = roman.RomanToArabic("XIV");
		assertEquals(14, result);
	}

	@Test
	public void check_hundreds_to_arabig() {
		RomanConverter roman = new RomanConverter();
		int result = roman.RomanToArabic("CDXLIV");
		assertEquals(444, result);
	}

	@Test
	public void check_thousands_to_arabic() {
		RomanConverter roman = new RomanConverter();
		int result = roman.RomanToArabic("MMMDCCCXCVII");
		assertEquals(3897, result);
	}

}
