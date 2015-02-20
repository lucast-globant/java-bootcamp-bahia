package Topic_2.Ex_2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class WordWrappingTest {

	@Test
	public void example1() {
		WordWrapping wordWrapping = new WordWrapping();
		List<String> result = wordWrapping.wordWrapAlgorithm(60, "First run word-wrapping.");
		assertEquals("First run word-wrapping.", result.get(0));
	}

	@Test
	public void example2() {
		WordWrapping wordWrapping = new WordWrapping();
		List<String> result = wordWrapping.wordWrapAlgorithm(7, "Hello Word!");
		assertEquals("Hello", result.get(0));
		assertEquals("Word!", result.get(1));
	}

	@Test
	public void example3() {
		WordWrapping wordWrapping = new WordWrapping();
		List<String> result = wordWrapping.wordWrapAlgorithm(3, "a b c d e f");
		assertEquals("a b", result.get(0));
		assertEquals("c d", result.get(1));
		assertEquals("e f", result.get(2));
	}

	@Test
	public void example4() {
		WordWrapping wordWrapping = new WordWrapping();
		List<String> result = wordWrapping.wordWrapAlgorithm(5, "Excelent");
		assertEquals("Excel", result.get(0));
		assertEquals("ent", result.get(1));
	}
}
