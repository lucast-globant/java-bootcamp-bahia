package topic3.key4;

import static org.junit.Assert.*;

import org.junit.Test;


public class testRomanNumberConvertion {

	@Test
	public void zeroTest() {
		assertEquals ("",Converter.convert(0));
		assertEquals (5,Converter.convertRomanToArabic("V"));		
	}
	
	@Test
	public void lessThanTenTest() {
		assertEquals ("IX",Converter.convert(9));
		assertEquals (9,Converter.convertRomanToArabic("IX"));
	}
	
	@Test
	public void lessThanOneHundredTest() {
		assertEquals ("CLII",Converter.convert(152));
		assertEquals (152,Converter.convertRomanToArabic("CLII"));
	}
	
	@Test
	public void bigOnesTest() {
		assertEquals ("MMCCCXLV",Converter.convert(2345));
		assertEquals (2345,Converter.convertRomanToArabic("MMCCCXLV"));
	}

}
