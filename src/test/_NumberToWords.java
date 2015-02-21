package test;

import static org.junit.Assert.*;

import org.junit.Test;

import convertion.NumberToWords;

public class _NumberToWords {

	@Test
	public void withoutCents() {
		String res=NumberToWords.convert(23);
		assertEquals(res,"twenty three dollars");
		
		res=NumberToWords.convert(2523);
		assertEquals(res, "two thousand five hundred twenty three dollars");
		
		res=NumberToWords.convert(1002523);
		assertEquals(res, "one million two thousand five hundred twenty three dollars");
	}
	
	@Test
	public void withCents(){
		
		String res=NumberToWords.convert(2523.04);
		assertEquals(res, "two thousand five hundred twenty three and 04/100 dollars");
	}
	
}
