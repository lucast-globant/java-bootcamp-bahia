package keyPoint2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class WrapWordTest {

	//If the row-length is 60 and the input string is 30, the result is just the input string
	@Test
	public void testNo1() {
		List<String> result;
		WrappedWord wrappedWord = new WrappedWord("just a phrase to test the no.1");
		result = wrappedWord.wrapWords(60);
		assertEquals("just a phrase to test the no.1", result.get(0));
		assertEquals(1, result.size());
	}
	
	//If the row-length is 7 and the input string is "Hello Word!", the result should be: "Hello", "Word!"
	@Test
	public void testNo2(){
		List<String> result;
		WrappedWord wrappedWord = new WrappedWord("Hello Word!");
		result = wrappedWord.wrapWords(7);
		assertEquals("Hello", result.get(0));
		assertEquals("Word!", result.get(1));
		assertEquals(2, result.size());
	}
	
	//If the row-length is 3 and the input string is "a b c d e f", the result should be "a b", "c d", "e f"
	@Test 
	public void testNo3(){
		List<String> result;
		WrappedWord wrappedWord = new WrappedWord("a b c d e f");
		result = wrappedWord.wrapWords(3);
		assertEquals("a b", result.get(0));
		assertEquals("c d", result.get(1));
		assertEquals("e f", result.get(2));
		assertEquals(3, result.size());
	}
	
	//If the row-length is 5 and the input string is "Excelent", the result should be "Excel", "ent"
	@Test
	public void testNo4(){
		List<String> result;
		WrappedWord wrappedWord = new WrappedWord("Excelent");
		result = wrappedWord.wrapWords(5);
		assertEquals("Excel", result.get(0));
		assertEquals("ent", result.get(1));
		assertEquals(2, result.size());
	}
}
