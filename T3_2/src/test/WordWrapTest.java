package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrapTest {
	
	@Test
	public void example1(){
		assertEquals("qwertyuiopasdfghjklzxcvbnmqwer", WordWrapper.wrap("qwertyuiopasdfghjklzxcvbnmqwer", 60));
	}
	
	@Test
	public void example2(){
		assertEquals("Hello, Word!", WordWrapper.wrap("Hello Word!", 7));
	}
	
	@Test
	public void example3(){
		assertEquals("a b, c d, e f", WordWrapper.wrap("a b c d e f", 3));
	}
	
	@Test
	public void example4(){
		assertEquals("Excel ent", WordWrapper.wrap("Excelent", 5));
	}
	
}
