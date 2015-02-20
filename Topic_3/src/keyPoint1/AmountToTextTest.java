package keyPoint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountToTextTest {

	@Test
	public void testForZero() {
		CheckAmount checkAmount = new CheckAmount(0);
		String textCheck = checkAmount.toText();
		assertEquals("Zero and 0/100 dollars", textCheck);
	}

	@Test
	public void testForOnes() {
		CheckAmount checkAmount = new CheckAmount(1);
		String textCheck = checkAmount.toText();
		assertEquals("One and 0/100 dollars", textCheck);
		checkAmount.set(5);
		textCheck = checkAmount.toText();
		assertEquals("Five and 0/100 dollars", textCheck);
	}

	@Test
	public void testForTensUpTo19() {
		CheckAmount checkAmount = new CheckAmount(10);
		String textCheck = checkAmount.toText();
		assertEquals("Ten and 0/100 dollars", textCheck);
		checkAmount.set(16);
		textCheck = checkAmount.toText();
		assertEquals("Sixteen and 0/100 dollars", textCheck);
	}

	@Test
	public void testForTens20to99() {
		CheckAmount checkAmount = new CheckAmount(20f);
		String textCheck = checkAmount.toText();
		assertEquals("Twenty and 0/100 dollars", textCheck);
		checkAmount.set(68);
		textCheck = checkAmount.toText();
		assertEquals("Sixty-eight and 0/100 dollars", textCheck);
		checkAmount.set(71);
		textCheck = checkAmount.toText();
		assertEquals("Seventy-one and 0/100 dollars", textCheck);
	}

	@Test
	public void testForHundreds() {
		CheckAmount checkAmount = new CheckAmount(900);
		String textCheck = checkAmount.toText();
		assertEquals("Nine hundred and 0/100 dollars", textCheck);
		checkAmount.set(201);
		textCheck = checkAmount.toText();
		assertEquals("Two hundred one and 0/100 dollars", textCheck);
		checkAmount.set(316);
		textCheck = checkAmount.toText();
		assertEquals("Three hundred sixteen and 0/100 dollars", textCheck);
		checkAmount.set(410);
		textCheck = checkAmount.toText();
		assertEquals("Four hundred ten and 0/100 dollars", textCheck);
		checkAmount.set(666);
		textCheck = checkAmount.toText();
		assertEquals("Six hundred sixty-six and 0/100 dollars", textCheck);
		checkAmount.set(699);
		textCheck = checkAmount.toText();
		assertEquals("Six hundred ninety-nine and 0/100 dollars", textCheck);
	}

	@Test
	public void testWithCents() {
		CheckAmount checkAmount = new CheckAmount(10.53);
		String textCheck = checkAmount.toText();
		assertEquals("Ten and 53/100 dollars", textCheck);
		checkAmount.set(201.78);
		textCheck = checkAmount.toText();
		assertEquals("Two hundred one and 78/100 dollars", textCheck);
		checkAmount.set(99.99);
		textCheck = checkAmount.toText();
		assertEquals("Ninety-nine and 99/100 dollars", textCheck);
		checkAmount.set(416.10);
		textCheck = checkAmount.toText();
		assertEquals("Four hundred sixteen and 10/100 dollars", textCheck);
	}

	@Test
	public void testGeneral(){
		CheckAmount checkAmount = new CheckAmount(9000.23);
		String textCheck = checkAmount.toText();
		assertEquals("Nine thousand and 23/100 dollars", textCheck);
		checkAmount.set(2010.12);
		textCheck = checkAmount.toText();
		assertEquals("Two thousand ten and 12/100 dollars", textCheck);
		checkAmount.set(3016.44);
		textCheck = checkAmount.toText();
		assertEquals("Three thousand sixteen and 44/100 dollars", textCheck);
		checkAmount.set(4100);
		textCheck = checkAmount.toText();
		assertEquals("Four thousand one hundred and 0/100 dollars", textCheck);
		checkAmount.set(958123.33);
		textCheck = checkAmount.toText();
		assertEquals("Nine hundred fifty-eight thousand one hundred twenty-three and 33/100 dollars", textCheck);
		checkAmount.set(10845100.13);
		textCheck = checkAmount.toText();
		assertEquals("Ten million eight hundred forty-five thousand one hundred and 13/100 dollars", textCheck);
		checkAmount.set(1000000.13);
		textCheck = checkAmount.toText();
		assertEquals("One million and 13/100 dollars", textCheck);
	}
}
