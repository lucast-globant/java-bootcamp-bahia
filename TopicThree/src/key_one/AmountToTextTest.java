package key_one;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountToTextTest {

	@Test
	public void testForConvert_1_to_text() {
		assertEquals("one and 00/100 dollars",
				new NumberConverter(1).toAppropiateText());
	}

	@Test
	public void testForConvert_2_to_text() {
		assertEquals("two and 00/100 dollars",
				new NumberConverter(2).toAppropiateText());
	}

	@Test
	public void testForConvert_5_to_text() {
		assertEquals("five and 00/100 dollars",
				new NumberConverter(5).toAppropiateText());
	}

	@Test
	public void testForConvert_12_to_text() {
		assertEquals("twelve and 00/100 dollars",
				new NumberConverter(12).toAppropiateText());
	}

	@Test
	public void testForConvert_23_to_text() {
		assertEquals("twenty-three and 00/100 dollars",
				new NumberConverter(23).toAppropiateText());
	}

	@Test
	public void testForConvert_99_to_text() {
		assertEquals("ninety-nine and 00/100 dollars",
				new NumberConverter(99).toAppropiateText());
	}

	@Test
	public void testForConvert_100_to_text() {
		assertEquals("one hundred and 00/100 dollars",
				new NumberConverter(100).toAppropiateText());
	}

	@Test
	public void testForConvert_999_to_text() {
		assertEquals("nine hundred ninety-nine and 00/100 dollars",
				new NumberConverter(999).toAppropiateText());
	}

	@Test
	public void testForConvert_875_to_text() {
		assertEquals("eight hundred seventy-five and 00/100 dollars",
				new NumberConverter(875).toAppropiateText());
	}

	@Test
	public void testForConvert_1000_to_text() {
		assertEquals("one thousand and 00/100 dollars", new NumberConverter(
				1000).toAppropiateText());
	}

	@Test
	public void testForConvert_9999_to_text() {
		assertEquals(
				"nine thousand nine hundred ninety-nine and 00/100 dollars",
				new NumberConverter(9999).toAppropiateText());
	}

	@Test
	public void testForConvert_0_to_text() {
		assertEquals("zero and 00/100 dollars",
				new NumberConverter(0).toAppropiateText());
	}

	@Test
	public void testForConvert_1_with_50decimals_to_text() {
		assertEquals("one and 50/100 dollars",
				new NumberConverter(1.50).toAppropiateText());
	}

	@Test
	public void testForConvert_2523_with_04decimals_to_text() {
		assertEquals(
				"two thousand five hundred twenty-three and 04/100 dollars",
				new NumberConverter(2523.04).toAppropiateText());
	}

	@Test
	public void testForConvert_9999_with_99decimals_to_text() {
		assertEquals(
				"nine thousand nine hundred ninety-nine and 99/100 dollars",
				new NumberConverter(9999.99).toAppropiateText());
	}

}
