package key_two;

import java.util.LinkedList;

public class WordWrapper {

	public static LinkedList<String> wrap(String text, int rows) {
		LinkedList<String> wrapped = new LinkedList<String>();
		String[] words = text.split(" ");
		int wordsFit = 0;
		int rowsLeft = rows;
		while (wordsFit < words.length) {
			if (words[wordsFit].length() > rowsLeft) {
				words = cutWord(words, wordsFit, rows);
			}
			wrapped.add(words[wordsFit++]);
		}
		return wrapped;
	}

	private static String[] cutWord(String[] words, int pos, int rows) {
		String word = words[pos];
		int pieces = (int) Math.round((word.length() / rows) + 0.5);
		String[] wordInPieces = new String[pieces];
		for (int i = 0; i < pieces; i++) {
			int top = rows * (i + 1) > word.length() ? word.length() : rows
					* (i + 1);
			wordInPieces[i] = word.substring(i * rows, top);
		}
		String[] toR = new String[words.length + pieces - 1];
		toR = words;
		int aux = 1;
		for (int j = words.length - 1; j > pos; j--) {
			toR[toR.length - aux] = words[j];
			aux++;
		}
		aux = 0;
		for (int k = pos; k < pieces; k++) {
			toR[pos] = wordInPieces[aux++];
		}
		return wordInPieces;
	}

}
