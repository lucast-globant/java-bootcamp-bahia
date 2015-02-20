package topic_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingTest {

	@Test
	public void test_Row60_Input36() {
		WordWrapping word = new WordWrapping();
		String words = word.wrapAlg("This line that contains 36 caracters",60);
		assertEquals("This line that contains 36 caracters",words);
	}
	
	@Test
	public void test_example() {
		WordWrapping word = new WordWrapping();
		String words = word.wrapAlg("a b c d e f",3);
		assertEquals("\""+"a b"+"\""+", "+"\""+"c d"+"\""+", "+"\""+"e f"+"\"",words);
	}
	
	@Test
	public void test_example2() {
		WordWrapping word = new WordWrapping();
		String words = word.wrapAlg("Excelent",5);
		assertEquals("\""+"Excel"+"\""+", "+"\""+"ent"+"\"",words);
	}

}