package exc4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntTest {

	@Test
	public void testForConvert_I_to_1() {

		assertEquals(new Roman("I").toInt(), 1);
	}

	@Test
	public void testForConvert_II_to_2() {

		assertEquals(new Roman("II").toInt(), 2);
	}

	@Test
	public void testForConvert_III_to_3() {

		assertEquals(new Roman("III").toInt(), 3);
	}

	@Test
	public void testForConvert_IV_to_4() {

		assertEquals(new Roman("IV").toInt(), 4);
	}

	@Test
	public void testForConvert_V_to_5() {

		assertEquals(new Roman("V").toInt(), 5);
	}

	@Test
	public void testForConvert_VI_to_6() {

		assertEquals(new Roman("VI").toInt(), 6);
	}

	@Test
	public void testForConvert_VII_to_7() {

		assertEquals(new Roman("VII").toInt(), 7);
	}

	@Test
	public void testForConvert_VIII_to_8() {

		assertEquals(new Roman("VIII").toInt(), 8);
	}

	@Test
	public void testForConvert_IX_to_9() {

		assertEquals(new Roman("IX").toInt(), 9);
	}

	@Test
	public void testForConvert_X_to_10() {

		assertEquals(new Roman("X").toInt(), 10);
	}

}
