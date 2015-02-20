package key_four;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberToIntConverterTest {

	@Test
	public void testIto1() {
		assertEquals(1, new RomanToIntConverter("I").getIntRepresentation());
	}

	@Test
	public void testIVto4() {
		assertEquals(4, new RomanToIntConverter("IV").getIntRepresentation());
	}

	@Test
	public void testIXto9() {
		assertEquals(9, new RomanToIntConverter("IX").getIntRepresentation());
	}

	@Test
	public void testCDto400() {
		assertEquals(400, new RomanToIntConverter("CD").getIntRepresentation());
	}

	@Test
	public void testMCMXCIXto1999() {
		assertEquals(1999,
				new RomanToIntConverter("MCMXCIX").getIntRepresentation());
	}

	@Test
	public void test1toI() {
		assertEquals("I", new RomanToIntConverter(1).getRomanRepresentation());
	}

	@Test
	public void test28toXXVIII() {
		assertEquals("XXVIII",
				new RomanToIntConverter(28).getRomanRepresentation());
	}

	@Test
	public void test2997toMMCMXCVII() {
		assertEquals("MMCMXCVII",
				new RomanToIntConverter(2997).getRomanRepresentation());
	}

	@Test
	public void test3999toMMMCMXCIX() {
		assertEquals("MMMCMXCIX",
				new RomanToIntConverter(3999).getRomanRepresentation());
	}
}
