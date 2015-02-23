package exc4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanConverterTest {

	@Test
	public void test1() {
		assertEquals(new Integer(5), RomanConverter.romanToInt("V"));
	}

	@Test
	public void test2() {
		assertEquals("V", RomanConverter.intToRoman(5));
	}

	@Test
	public void test3() {
		assertEquals(new Integer(1949), RomanConverter.romanToInt("MCMXLIX"));
	}

	@Test
	public void test4() {
		assertEquals("MCMXLIX", RomanConverter.intToRoman(1949));
	}

}
