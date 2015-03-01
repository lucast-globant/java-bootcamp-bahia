package Topic_2.Ex_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntToWordsTest {

	@Test
	public void testOneDigit() {
		IntToWords number = new IntToWords();
		String result = number.convert(0.00f);
		assertEquals("Zero and 00/100 dollars", result);
	}

	@Test
	public void testTwoDigitsUntilTwenty() {
		IntToWords number = new IntToWords();
		String result = number.convert(13.00f);
		assertEquals("Thirteen and 00/100 dollars", result);
	}

	@Test
	public void testTwoDigitsUntilNinetyNine() {
		IntToWords number = new IntToWords();
		String result = number.convert(81.00f);
		assertEquals("Eighty-one and 00/100 dollars", result);
	}

	@Test
	public void testHundreds() {
		IntToWords number = new IntToWords();
		String result = number.convert(121.00f);
		assertEquals("One hundred twenty-one and 00/100 dollars", result);
	}

	@Test
	public void testThousands() {
		IntToWords number = new IntToWords();
		String result = number.convert(32321.00f);
		assertEquals("Thirty-two thousand three hundred twenty-one and 00/100 dollars", result);
	}

	@Test
	public void testThousandsTwo() {
		IntToWords number = new IntToWords();
		String result = number.convert(2523.04f);
		assertEquals("Two thousand five hundred twenty-three and 04/100 dollars", result);
	}

}
