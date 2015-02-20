package topic3.key1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConverter {

	@Test
	public void testNumbersToLetters() { 
		ConvertNumber convert = new ConverterNumber(10);
		assertEquals ("convert number 10","ten",convert.getLetters());
		convert.setNumber (100);
		assertEquals ("convert number 100","one hundred",convert.getLetters());	
		convert.setNumber (2523.04);
		assertEquals ("convert number 2523.04","two thousand five hundred twenty-three and 04/100 dollars",convert.getLetters());	
		convert.setNumber (2000.04);
		assertEquals ("convert number 2000.04","two thousand and 04/100 dollars",convert.getLetters());	
	}

}
