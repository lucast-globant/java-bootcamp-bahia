package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class convertTest {

	
	@Test
	public void convertTestToDollarZERO() {
		assertEquals("zero and 0/100 dollars", NumberToWords.toDollars((float) 0));
	}
	
	@Test
	public void convertTestToDollar() {
		assertEquals("two thousand five hundred twenty three and 4/100 dollars", NumberToWords.toDollars((float) 2523.04));
	}
	
	@Test
	public void convertTestToDollar1() {
		assertEquals("five hundred forty two and 20/100 dollars", NumberToWords.toDollars((float) 542.20));
	}
	
	@Test
	public void convertTestToDollar2() {
		assertEquals("two million five hundred forty nine thousand six hundred thirty five and 25/100 dollars", NumberToWords.toDollars((float) 2549635.13));
	}
	
	@Test
	public void convertTestToDollar3() {
		assertEquals("five and 0/100 dollars", NumberToWords.toDollars((float) 5));
	}


}
