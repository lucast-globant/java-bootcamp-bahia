package test;

import static org.junit.Assert.*;

import org.junit.Test;

import convertion.WordWrapper;

public class _WordWrapper {

	@Test
	public void rowLenghtGreaterThanInput() {
		
		String res=WordWrapper.wrap("Not Even Close To Reach 100 characters", 100);
		assertEquals("Not Even Close To Reach 100 characters", res);
	}
	
	@Test
	public void rowLenghtGreaterThanWord() {
		
		String res=WordWrapper.wrap("Hello Word!", 7);
		assertEquals("Hello,Word!", res);
		
		res=WordWrapper.wrap("a bb cc d e f", 3);
		assertEquals( "a,bb,cc,d e,f", res);
	}
	
	@Test
	public void normalCase() {

		String res=WordWrapper.wrap("a b c d e f", 3);
		assertEquals( "a b,c d,e f", res);
		
	}
	
	@Test
	public void veryLargeWord() {
		
		String res=WordWrapper.wrap("Excelent", 5);
		assertEquals("Excel,ent", res);
		
		res=WordWrapper.wrap("Hello Wooorld!!", 5);
		assertEquals("Hello,Wooor,ld!!", res);
	}

}
