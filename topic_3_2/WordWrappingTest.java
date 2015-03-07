package topic_3_2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class WordWrappingTest {

	@Test
	public void test_Row60_Input36() {
		List<String> wordWrappedRows = WordWrapping.wrap("This line that contains 41 caracters", 60);
		assertEquals(1,wordWrappedRows.size());
	}
	
	@Test
	public void test_example() {
		List<String> wordWrappedRows = WordWrapping.wrap("a b c d e f",3);
		assertEquals(3,wordWrappedRows.size());
	}
	
	@Test
	public void test_example2() {
		List<String> wordWrappedRows = WordWrapping.wrap("Excelent",5);
		assertEquals(2,wordWrappedRows.size());
	}
	
}