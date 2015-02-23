package test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import imp.WordWrapper;

public class WrapperTest {

	@Test
	public void example1() {
		WordWrapper WordWrapper = new WordWrapper();
		List<String> result = WordWrapper.wrapTxt("wut.", 60);
		assertEquals("First run word-wrapping.", result.get(0));
	}

	@Test
	public void example2() {
		WordWrapper WordWrapper = new WordWrapper();
		List<String> result = WordWrapper.wrapTxt("Hello Word!", 7);
		assertEquals("Hello", result.get(0));
		assertEquals("Word!", result.get(1));
	}

	@Test
	public void example3() {
		WordWrapper WordWrapper = new WordWrapper();
		List<String> result = WordWrapper.wrapTxt("a b c d e f", 3);
		assertEquals("a b", result.get(0));
		assertEquals("c d", result.get(1));
		assertEquals("e f", result.get(2));
	}

	@Test
	public void example4() {
		WordWrapper WordWrapper = new WordWrapper();
		List<String> result = WordWrapper.wrapTxt("Excelent", 5);
		assertEquals("Excel", result.get(0));
		assertEquals("ent", result.get(1));
	}


	
	
}
