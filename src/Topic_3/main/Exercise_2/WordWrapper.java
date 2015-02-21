package Topic_3.main.Exercise_2;

import java.util.LinkedList;
import java.util.List;

public class WordWrapper {

	public List<String> wordwrapText(String text, int rowLength) {
		List<String> result = new LinkedList<String>();

		while (text.length() > rowLength) {
			String currentRow = text.substring(0, Math.min(rowLength, text.length()));
			String nextRow = text.substring(rowLength, Math.min(2 * rowLength, text.length()));

			int rowLastSpacePos = currentRow.lastIndexOf(' ');
			int nextRowFirstSpacePos = nextRow.indexOf(' ');

			if (nextRowFirstSpacePos == 0) {
				// Current row has complete words
				// Add row to list
				result.add(currentRow.trim());

				// Cut text from next word
				text = text.substring(nextRowFirstSpacePos + rowLength + 1, text.length());

				continue;
			}

			// Row doesn't have complete words

			if (rowLastSpacePos != -1) {
				// Row has spaces

				// Get the last-incomplete-word length
				int incompleteWord = (currentRow.length() - 1 - rowLastSpacePos) + nextRowFirstSpacePos;

				if (incompleteWord <= rowLength) {
					// Can fit last incomplete word in next row
					// Add current row without it
					result.add(currentRow.substring(0, rowLastSpacePos).trim());

					// Cut text from the beginning of last incomplete word
					text = text.substring(rowLastSpacePos + 1, text.length());

					continue;
				}
			}

			// Row has no spaces or last incomplete word doesn't fit in next row
			// Add it to the list
			result.add(currentRow);

			// Cut text from row length
			text = text.substring(Math.min(rowLength, text.length()));
		}

		result.add(text.trim());

		return result;
	}
}
