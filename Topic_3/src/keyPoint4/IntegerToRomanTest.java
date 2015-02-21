package keyPoint4;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

	@Test
	public void test1to9() {
		RomanIntegerConverter romanIntConv = new RomanIntegerConverter();
		String roman = romanIntConv.toRoman(1);
		assertEquals("I", roman);
		roman = romanIntConv.toRoman(2);
		assertEquals("II", roman);
		roman = romanIntConv.toRoman(3);
		assertEquals("III", roman);
		roman = romanIntConv.toRoman(4);
		assertEquals("IV", roman);
		roman = romanIntConv.toRoman(5);
		assertEquals("V", roman);
		roman = romanIntConv.toRoman(6);
		assertEquals("VI", roman);
		roman = romanIntConv.toRoman(7);
		assertEquals("VII", roman);
		roman = romanIntConv.toRoman(8);
		assertEquals("VIII", roman);
		roman = romanIntConv.toRoman(9);
		assertEquals("IX", roman);

	}

	@Test
	public void testTens() {
		RomanIntegerConverter romanIntConv = new RomanIntegerConverter();
		String roman = romanIntConv.toRoman(10);
		assertEquals("X", roman);
		roman = romanIntConv.toRoman(20);
		assertEquals("XX", roman);
		roman = romanIntConv.toRoman(30);
		assertEquals("XXX", roman);
		roman = romanIntConv.toRoman(40);
		assertEquals("XL", roman);
		roman = romanIntConv.toRoman(50);
		assertEquals("L", roman);
		roman = romanIntConv.toRoman(60);
		assertEquals("LX", roman);
		roman = romanIntConv.toRoman(70);
		assertEquals("LXX", roman);
		roman = romanIntConv.toRoman(80);
		assertEquals("LXXX", roman);
		roman = romanIntConv.toRoman(90);
		assertEquals("XC", roman);
	}
	
	@Test
	public void testGeneral() {
		RomanIntegerConverter romanIntConv = new RomanIntegerConverter();
		String roman = romanIntConv.toRoman(100);
		assertEquals("C", roman);
		roman = romanIntConv.toRoman(220);
		assertEquals("CCXX", roman);
		roman = romanIntConv.toRoman(315);
		assertEquals("CCCXV", roman);
		roman = romanIntConv.toRoman(444);
		assertEquals("CDXLIV", roman);
		roman = romanIntConv.toRoman(1919);
		assertEquals("MCMXIX", roman);
		roman = romanIntConv.toRoman(3849);
		assertEquals("MMMDCCCXLIX", roman);
		roman = romanIntConv.toRoman(16);
		assertEquals("XVI", roman);
		roman = romanIntConv.toRoman(89);
		assertEquals("LXXXIX", roman);
		roman = romanIntConv.toRoman(618);
		assertEquals("DCXVIII", roman);
	}
	
	@Test
	public void testToIntSimpleOnes() {
		RomanIntegerConverter romanIntConv = new RomanIntegerConverter();
		int integer = romanIntConv.toInt("MCCLXIII");
		assertEquals(1263, integer);
	}
	
	@Test
	public void testToIntGeneral(){
		RomanIntegerConverter romanIntConv = new RomanIntegerConverter();
		int integer = romanIntConv.toInt("MCCLXIII");
		assertEquals(1263, integer);
		integer = romanIntConv.toInt("C");
		assertEquals(100, integer);
		integer = romanIntConv.toInt("CCXX");
		assertEquals(220, integer);
		integer = romanIntConv.toInt("CCCXV");
		assertEquals(315, integer);
		integer = romanIntConv.toInt("CDXLIV");
		assertEquals(444, integer);
		integer = romanIntConv.toInt("MCMXIX");
		assertEquals(1919, integer);
		integer = romanIntConv.toInt("MMMDCCCXLIX");
		assertEquals(3849, integer);
		integer = romanIntConv.toInt("LXXXIX");
		assertEquals(89, integer);
		integer = romanIntConv.toInt("DCXVIII");
		assertEquals(618, integer);
	}
}
