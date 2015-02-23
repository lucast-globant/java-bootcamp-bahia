package exc1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberConverterTest {

	@Test
	public void checkOneDigitNumber() {
		NumberConverter converter = new NumberConverter();
		assertEquals("four dollars", converter.maskConverter(4));
	}

	@Test
	public void checkTwoDigitNumber() {
		NumberConverter converter = new NumberConverter();
		assertEquals("seventeen dollars", converter.maskConverter(17));
	}

	@Test
	public void checkThreeDigitNumber() {
		NumberConverter converter = new NumberConverter();
		assertEquals("one hundred dollars", converter.maskConverter(100));
	}

	@Test
	public void checkDecilDigitNumber() {
		NumberConverter converter = new NumberConverter();
		assertEquals("five and 45/100 dollars", converter.maskConverter(5.45));
	}

	@Test
	public void checkBiggerNumber() {
		NumberConverter converter = new NumberConverter();
		assertEquals("two million five hundred thirty six thousand five hundred twenty four and 56/100 dollars",
				converter.maskConverter(2536524.56));
	}

}
