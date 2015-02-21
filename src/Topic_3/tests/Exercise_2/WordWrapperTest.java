package Topic_3.tests.Exercise_2;

import Topic_3.main.Exercise_2.WordWrapper;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordWrapperTest {

	@Test
	public void wordwrapText_Bigger_Row_Than_Text_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("Hola", 60);

		List<String> result = Arrays.asList("Hola");

		assertEquals(result.toString(), wordWrapped.toString());
	}

	@Test
	public void wordwrapText_No_Spaces_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("Holaatodoscomolesva", 7);

		List<String> result = Arrays.asList("Holaato", "doscomo", "lesva");

		assertEquals(result.toString(), wordWrapped.toString());
	}

	@Test
	public void wordwrapText_With_Spaces_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("Hola a todos como les va", 7);

		List<String> result = Arrays.asList("Hola a", "todos", "como", "les va");

		assertEquals(result.toString(), wordWrapped.toString());
	}

	@Test
	public void wordwrapText_With_Spaces_Long_Word_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("Holaaaaa a todos comooooo les va", 7);

		List<String> result = Arrays.asList("Holaaaa", "a a", "todos", "comoooo", "o les", "va");

		assertEquals(result.toString(), wordWrapped.toString());
	}

	@Test
	public void wordwrapText_Hello_World_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("Hello Word!", 7);

		List<String> result = Arrays.asList("Hello", "Word!");

		assertEquals(result.toString(), wordWrapped.toString());
	}

	@Test
	public void wordwrapText_a_b_c_d_e_f_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("a b c d e f", 3);

		List<String> result = Arrays.asList("a b", "c d", "e f");

		assertEquals(result.toString(), wordWrapped.toString());
	}

	@Test
	public void wordwrapText_Exellent_Return_Ok() {
		List<String> wordWrapped = new WordWrapper().wordwrapText("Excellent", 5);

		List<String> result = Arrays.asList("Excel", "lent");

		assertEquals(result.toString(), wordWrapped.toString());
	}
}