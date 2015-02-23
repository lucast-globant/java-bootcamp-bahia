package test;

import static org.junit.Assert.*;

import org.junit.Test;

import imp.Converter;

public class ConverterTest {
	@Test
	public void check_zero() {
		String ret = new Converter().getWords(0);
		assertEquals("Zero and 00/100 dollars", ret);
	}
	@Test
	public void check_lessThan10() {
		String ret = new Converter().getWords(5.55f);
		assertEquals("Five and 55/100 dollars", ret);
	}
	@Test
	public void check_lessThan100() {
		String ret = new Converter().getWords(55.55f);
		assertEquals("Fifty-five and 55/100 dollars", ret);
	}
	@Test
	public void check_lessThan1000() {
		String ret = new Converter().getWords(555.55f);
		assertEquals("Five hundred fifty-five and 55/100 dollars", ret);
	}
	@Test
	public void check_lessThan10000() {
		String ret = new Converter().getWords(5555.55f);
		assertEquals("Five thousand five hundred fifty-five and 55/100 dollars", ret);
	}
	@Test
	public void check_lessThan1000000() {
		String ret = new Converter().getWords(555555.55f); //round problem
		assertEquals("Five hundred fifty-five thousand five hundred fifty-five and 56/100 dollars", ret);
	}

}
