package test;

import static org.junit.Assert.*;

import org.junit.Test;

import convertion.RomanConverter;

public class _RomanConverter {

	@Test
	public void romanToDecimal() {
		int i=RomanConverter.convert("XIII");
		assertEquals(13, i);
		i=RomanConverter.convert("IX");
		assertEquals(9, i);
		i=RomanConverter.convert("MCMLIV");
		assertEquals(1954, i); 
		
		
	}
	
	@Test
	public void decimalToRoman() {
	
		String i=RomanConverter.convert(5);
		assertEquals("V", i);
		i=RomanConverter.convert(10);
		assertEquals("X", i);
		i=RomanConverter.convert(26);
		assertEquals("XXVI", i);
		i=RomanConverter.convert(1954);
		assertEquals("MCMLIV", i);		
		i=RomanConverter.convert(4000);
		assertEquals("Error! number to high", i);
	}

}
