package Topic_3.tests.Exercise_4;

import Topic_3.main.Exercise_4.RomanConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanConverterTest {

	@Test
	public void IntToRoman_Returns_Ok() {
		String roman = new RomanConverter().intToRoman(150);

		assertEquals("CL", roman);
	}

	@Test
	public void IntToRoman_Irregular_Returns_Ok() {
		String roman = new RomanConverter().intToRoman(159);

		assertEquals("CLIX", roman);
	}

	@Test
	public void IntToRoman_Irregular_Big_Returns_Ok() {
		String roman = new RomanConverter().intToRoman(1495);

		assertEquals("MCDXCV", roman);
	}

	@Test
	public void IntToRoman_Irregular2_Big_Returns_Ok() {
		String roman = new RomanConverter().intToRoman(1234);

		assertEquals("MCCXXXIV", roman);
	}

	@Test
	public void IntToRoman_Too_Big_Returns_Error() {
		String roman = new RomanConverter().intToRoman(33899);

		assertEquals("Integer is too big.", roman);
	}

	@Test
	public void IntToRoman_Max_Integer_Returns_Ok() {
		String roman = new RomanConverter().intToRoman(3999);

		assertEquals("MMMCMXCIX", roman);
	}

	@Test
	public void RomanToInt_Regular_Returns_Ok() {
		int roman = new RomanConverter().romanToInt("CLXVII");

		assertEquals(167, roman);
	}

	@Test
	public void RomanToInt_Regular_Big_Returns_Ok() {
		int roman = new RomanConverter().romanToInt("MMCLX");

		assertEquals(2160, roman);
	}

	@Test
	public void RomanToInt_Irregular_Returns_Ok() {
		int roman = new RomanConverter().romanToInt("XLIX");

		assertEquals(49, roman);
	}

	@Test
	public void RomanToInt_Irregular_Big_Returns_Ok() {
		int roman = new RomanConverter().romanToInt("MCMXCIV");

		assertEquals(1994, roman);
	}

	@Test
	public void RomanToInt_Max_Integer_Returns_Ok() {
		int roman = new RomanConverter().romanToInt("MMMCMXCIX");

		assertEquals(3999, roman);
	}
}
