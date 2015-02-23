package com.aguirre.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aguirre.classes.Converter;


public class ConvertTest {

	@Test
	public void lessThan1Dollar() {
		Converter conv = Converter.getInstance();
		String text = conv.convert(0.56);
		assertEquals("56/100 dollars",text);
		text = conv.convert(0.20);
		assertEquals("20/100 dollars",text);
		text = conv.convert(0.00);
		assertEquals("zero dollars",text);
	}
	
	@Test
	public void lessThan20Dollars() {
		Converter conv = Converter.getInstance();
		String text = conv.convert(5.00);
		assertEquals("five dollars",text);
		text = conv.convert(5.56);
		assertEquals("five and 56/100 dollars",text);
		text = conv.convert(13.00);
		assertEquals("thirteen dollars",text);
		text = conv.convert(13.86);
		assertEquals("thirteen and 86/100 dollars",text);
	}
	
	@Test
	public void lessThan100Dollars() {
		Converter conv = Converter.getInstance();
		String text = conv.convert(20.30);
		assertEquals("twenty and 30/100 dollars",text);
		text = conv.convert(50.00);
		assertEquals("fifty dollars",text);
		text = conv.convert(99.75);
		assertEquals("ninety-nine and 75/100 dollars",text);
		text = conv.convert(86.00);
		assertEquals("eighty-six dollars",text);
	}
	
	@Test
	public void lessThan1000Dollars() {
		Converter conv = Converter.getInstance();
		String text = conv.convert(120.30);
		assertEquals("one hundred twenty and 30/100 dollars",text);
		text = conv.convert(550.00);
		assertEquals("five hundred fifty dollars",text);
		text = conv.convert(999.75);
		assertEquals("nine hundred ninety-nine and 75/100 dollars",text);
		text = conv.convert(386.00);
		assertEquals("three hundred eighty-six dollars",text);
		
	}
	
	@Test
	public void lessThanOneMillionDollars() {
		Converter conv = Converter.getInstance();
		String text = conv.convert(1000.00);
		assertEquals("one thousand dollars",text);
		text = conv.convert(6552.05);
		assertEquals("six thousand five hundred fifty-two and 05/100 dollars",text);
		text = conv.convert(301999.86);
		assertEquals("three hundred one thousand nine hundred ninety-nine and 86/100 dollars",text);
		text = conv.convert(91386.20);
		assertEquals("ninety-one thousand three hundred eighty-six and 20/100 dollars",text);
	}
}
