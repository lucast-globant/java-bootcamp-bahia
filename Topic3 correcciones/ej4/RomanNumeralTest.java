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
	public void exampleRomanToNumeral3() {
		RomanNumeral rn = new RomanNumeral("MLXIII");
		assertEquals(1063, rn.toInt());
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
	
	@Test
	public void exampleNumeralToRoman3(){
		RomanNumeral rn = new RomanNumeral(1520);
		assertEquals("MDXX", rn.toString());
	}
	
	
	@Test
	public void exampleRomanToNumeralOver() {
		try {
			RomanNumeral rn = new RomanNumeral("MMMM");
		}
		catch (NumberFormatException e) {
			assertEquals("Roman numeral must have value 3999 or less.", e.getMessage());
		}
	}
	
	@Test
	public void exampleRomanToNumeralIlegalChar() {
		try {
			RomanNumeral rn = new RomanNumeral("Z");	
		}
		catch (NumberFormatException e) {
			assertEquals("Value of RomanNumeral must be a correct character.", e.getMessage());
		}
	}
	
	@Test
	public void exampleRomanToNumeralZero() {
		try {
			RomanNumeral rn = new RomanNumeral(0);	
		}
		catch (NumberFormatException e) {
			assertEquals("Value of RomanNumeral must be positive.", e.getMessage());
		}
	}
	
	@Test
	public void exampleRomanToNumeralEmpty() {
		try {
			RomanNumeral rn = new RomanNumeral("");	
		}
		catch (NumberFormatException e) {
			assertEquals("An empty string does not define a Roman numeral.", e.getMessage());
		}
	}
	
}
