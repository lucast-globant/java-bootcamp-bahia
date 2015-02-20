package key_two;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.LinkedList;

import key_one.NumberConverter;

import org.junit.Test;

public class WordWrappingTest {

	@Test
	public void testWrappNone() {
		LinkedList<String> wrapped = WordWrapper.wrap("", 1);
		assertEquals("", wrapped.get(0));
	}

	@Test
	public void testWrappHelloWith30Rows() {
		LinkedList<String> wrapped = WordWrapper.wrap("Hello", 30);
		assertEquals("Hello", wrapped.get(0));
	}

	@Test
	public void testWrappHelloWith4Rows() {
		LinkedList<String> wrapped = WordWrapper.wrap("Hello", 4);
		assertEquals(wrapped.get(0), "Hell");
		assertEquals(wrapped.get(1), "o");
	}

	@Test
	public void testWrappRandom() {
		LinkedList<String> wrapped = WordWrapper.wrap("Hello Word!asd as ", 8);
		assertEquals("Hello", wrapped.get(0));
		assertEquals("Word!asd", wrapped.get(1));
		assertEquals("as", wrapped.get(2));
	}

	@Test
	public void testWrappHelloWordWith7Rows() {
		LinkedList<String> wrapped = WordWrapper.wrap("Hello Word!", 7);
		assertEquals("Hello", wrapped.get(0));
		assertEquals("Word!", wrapped.get(1));
	}

	@Test
	public void testWrappExcellent() {
		LinkedList<String> wrapped = WordWrapper.wrap("Excellent", 5);
		assertEquals("Excel", wrapped.get(0));
		assertEquals("lent", wrapped.get(1));
	}
}
