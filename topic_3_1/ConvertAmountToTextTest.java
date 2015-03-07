package topic_3_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
Convert an amount on a check to appropiate text. For example:
2523.04 --> Two thousand five hundred twenty-three and 04/100 dollars
*/

public class ConvertAmountToTextTest {

	@Test
	public void test_100_toText() {
		Check check = new Check(100.0);
		String text = check.toText();
		assertEquals("One hundred dollars",text);
	}
	
	@Test
	public void test_NegativeAmounts() {
		Check check = new Check(-48.55);
		String text = check.toText();
		assertEquals("The amount has to be positive",text);
	}
	
	@Test
	public void test_InvalidAmounts() {
		Check check = new Check(1145879.95);
		String text = check.toText();
		assertEquals("The amount has to be minor to 1000000",text);
	}
	
	@Test
	public void test_LessThan20Amounts() {
		Check check = new Check(9.95);
		String text = check.toText();
		assertEquals("Nine and 95/100 dollars",text);
	}
	
	@Test
	public void test_LessThan100Amounts() {
		Check check = new Check(49.05);
		String text = check.toText();
		assertEquals("Forty Nine and 05/100 dollars",text);
	}
	
	@Test
	public void test_LessThan1000Amounts2() {
		Check check = new Check(114.25);
		String text = check.toText();
		assertEquals("One hundred Fourteen and 25/100 dollars",text);
	}
	
	@Test
	public void test_LessThan1000Amounts4() {
		Check check = new Check(999.99);
		String text = check.toText();
		assertEquals("Nine hundred Ninety Nine and 99/100 dollars",text);
	}
	@Test
	public void test_LessThan100Amounts2() {
		Check check = new Check(91.0);
		String text = check.toText();
		assertEquals("Ninety One dollars",text);
	}
	
	@Test
	public void test_LessThan1000Amounts3() {
		Check check = new Check(101.75);
		String text = check.toText();
		assertEquals("One hundred One and 75/100 dollars",text);
	}
	
	@Test
	public void test_example() {
		Check check = new Check(2523.04);
		String text = check.toText();
		assertEquals("Two thousand Five hundred Twenty Three and 04/100 dollars",text);
	}
	
	@Test
	public void test_example2() {
		Check check = new Check(22523.04);
		String text = check.toText();
		assertEquals("Twenty Two thousand Five hundred Twenty Three and 04/100 dollars",text);
	}
}
