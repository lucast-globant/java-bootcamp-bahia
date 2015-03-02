import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void exampleRomanToNumeral1() {
		RomanNumeral rn = new RomanNumeral("X");
		assertEquals(10, rn.toInt());
	}
	
	@Test
	public void exampleRomanToNumeral2() {
		RomanNumeral rn = new RomanNumeral("XXIII");
		assertEquals(23, rn.toInt());
	}

	@Test
	public void exampleNumeralToRoman1(){
		RomanNumeral rn = new RomanNumeral(10);
		assertEquals("X", rn.toString());
	}
	@Test
	public void exampleNumeralToRoman2(){
		RomanNumeral rn = new RomanNumeral(324);
		assertEquals("CCCXXIV", rn.toString());
	}
}
