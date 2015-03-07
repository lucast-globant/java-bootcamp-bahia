package topic_3_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberConverterTest {

	@Test
	public void test_IV_to_4() {
		NumberConverter nc = new NumberConverter();
		int four = nc.romanToInt("IV");
		assertEquals(4,four);
	}
	
	@Test
	public void test_MCMLIV_to_1954() {
		NumberConverter nc = new NumberConverter();
		int number = nc.romanToInt("MCMLIV");
		assertEquals(1954,number);
	}

	@Test
	public void test_MCMXC_to_1990() {
		NumberConverter nc = new NumberConverter();
		int number = nc.romanToInt("MCMXC");
		assertEquals(1990,number);
	}
	
	@Test
	public void test_4_to_IV() {
		NumberConverter nc = new NumberConverter();
		String number = nc.intToRoman(4);
		assertEquals("IV",number);
	}
	
	@Test
	public void test_1954_to_MCMLIV() {
		NumberConverter nc = new NumberConverter();
		String number = nc.intToRoman(1954);
		assertEquals("MCMLIV",number);
	}
	
	@Test
	public void test_1990_to_MCMXC() {
		NumberConverter nc = new NumberConverter();
		String number = nc.intToRoman(1990);
		assertEquals("MCMXC",number);
	}
}
