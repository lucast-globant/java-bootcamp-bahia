package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class convertTest {

	@Test
	public void convertTestToDollar() {
		assertEquals("two thousand five hundred twenty three and 4/100 dollars", NumberToWords.toDollars((float) 2523.04));
	}

}
