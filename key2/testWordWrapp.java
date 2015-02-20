package topic3.key2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testWordWrapp {

	@Test
	public void noTest() {
		assertEquals ("Word",WordWrapper.wrap("Word",8));
	}
	
	@Test
	public void singleWordTest () {
		assertEquals ("Wo, rd",WordWrapper.wrap("Word",2));
		assertEquals ("Word, Word",WordWrapper.wrap("WordWord",4));
	}
	
	@Test
	public void twoWordsTest () {
		assertEquals ("Word, Word",WordWrapper.wrap("Word Word",4));
	}
	
	@Test
	public void threeWordsTest () {
		assertEquals ("Word, Word, Word",WordWrapper.wrap("Word Word Word",4));
		assertEquals ("Word, Word, Word",WordWrapper.wrap("Word Word Word",6));
	}
	
	@Test
	public void topicTest () {
		assertEquals ("Entire Word",WordWrapper.wrap("Entire Word",70));
		assertEquals ("hello, word!",WordWrapper.wrap("hello word!",7));
		assertEquals ("Excel, ent",WordWrapper.wrap("Excelent",5));
		assertEquals ("a b, c d, e f",WordWrapper.wrap("a b c d e f",3));
		
	}
	
}
