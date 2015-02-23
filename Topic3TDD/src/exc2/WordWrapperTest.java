package exc2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordWrapperTest {

	@Test
	public void firstExampleTest() {
		List<String> expected = new ArrayList<String>();
		expected.add("Hello!");
		assertEquals(expected, WordWrapper.wrapper("Hello!", 60));
	}

	@Test
	public void secondExampleTest() {
		List<String> expected = new ArrayList<String>();
		expected.add("Hello");
		expected.add("World!");
		assertEquals(expected, WordWrapper.wrapper("Hello World!", 6));
	}

	@Test
	public void thirdExampleTest() {
		List<String> expected = new ArrayList<String>();
		expected.add("a b");
		expected.add("c d");
		expected.add("e f");
		assertEquals(expected, WordWrapper.wrapper("a b c d e f", 3));
	}

	@Test
	public void fourExampleTest() {
		List<String> expected = new ArrayList<String>();
		expected.add("Excel");
		expected.add("ent");
		assertEquals(expected, WordWrapper.wrapper("Excelent", 5));
	}

}
