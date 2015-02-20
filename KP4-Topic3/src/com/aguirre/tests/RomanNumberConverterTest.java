package com.aguirre.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aguirre.classes.RomanNumberConverter;

public class RomanNumberConverterTest {

	@Test
	public void oneLetter() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		int num = converter.converToInt("I");
		assertEquals(1, num);
		num = converter.converToInt("V");
		assertEquals(5, num);
		num = converter.converToInt("X");
		assertEquals(10, num);
		num = converter.converToInt("L");
		assertEquals(50, num);
		num = converter.converToInt("C");
		assertEquals(100, num);
		num = converter.converToInt("D");
		assertEquals(500, num);
		num = converter.converToInt("M");
		assertEquals(1000, num);
	}

	@Test
	public void noSubtractions() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		int num = converter.converToInt("II");
		assertEquals(2, num);
		num = converter.converToInt("VII");
		assertEquals(7, num);
		num = converter.converToInt("XXVI");
		assertEquals(26, num);
		num = converter.converToInt("LXXXVIII");
		assertEquals(88, num);
		num = converter.converToInt("CLXVI");
		assertEquals(166, num);
		num = converter.converToInt("DCCLXXVII");
		assertEquals(777, num);
		num = converter.converToInt("MMDCLXXVI");
		assertEquals(2676, num);
	}

	@Test
	public void subtractions() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		int num = converter.converToInt("IV");
		assertEquals(4, num);
		num = converter.converToInt("IX");
		assertEquals(9, num);
		num = converter.converToInt("XL");
		assertEquals(40, num);
		num = converter.converToInt("XC");
		assertEquals(90, num);
		num = converter.converToInt("CD");
		assertEquals(400, num);
		num = converter.converToInt("CM");
		assertEquals(900, num);
	}

	@Test
	public void RomanNumbers() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		int num = converter.converToInt("XIV");
		assertEquals(14, num);
		num = converter.converToInt("XLIV");
		assertEquals(44, num);
		num = converter.converToInt("XCVII");
		assertEquals(97, num);
		num = converter.converToInt("DCXLIV");
		assertEquals(644, num);
		num = converter.converToInt("CDVI");
		assertEquals(406, num);
		num = converter.converToInt("CMLXXIV");
		assertEquals(974, num);
		num = converter.converToInt("MMCDXIV");
		assertEquals(2414, num);
	}

	@Test
	public void numberToOneLetter() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		String num = converter.converToRomanNumber(1);
		assertEquals("I", num);
		num = converter.converToRomanNumber(5);
		assertEquals("V", num);
		num = converter.converToRomanNumber(10);
		assertEquals("X", num);
		num = converter.converToRomanNumber(50);
		assertEquals("L", num);
		num = converter.converToRomanNumber(100);
		assertEquals("C", num);
		num = converter.converToRomanNumber(500);
		assertEquals("D", num);
		num = converter.converToRomanNumber(1000);
		assertEquals("M", num);
	}

	@Test
	public void onlyThousands() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		String num = converter.converToRomanNumber(1000);
		assertEquals("M", num);
		num = converter.converToRomanNumber(5000);
		assertEquals("MMMMM", num);
		num = converter.converToRomanNumber(9000);
		assertEquals("MMMMMMMMM", num);
	}

	@Test
	public void normalNumbers() {
		RomanNumberConverter converter = RomanNumberConverter.getInstance();
		String num = converter.converToRomanNumber(156);
		assertEquals("CLVI", num);
		num = converter.converToRomanNumber(2015);
		assertEquals("MMXV", num);
		num = converter.converToRomanNumber(777);
		assertEquals("DCCLXXVII", num);
		num = converter.converToRomanNumber(1444);
		assertEquals("MCDXLIV", num);
	}
}
