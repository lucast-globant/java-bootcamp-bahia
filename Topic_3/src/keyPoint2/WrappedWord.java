package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class WrappedWord {

	private String originalString;

	public WrappedWord(String string) {
		originalString = string;
	}

	public List<String> wrapWords(int i) {
		List<String> result;
		result = new ArrayList<String>();

		String aux, copyOfString;
		int lastSpace;

		copyOfString = originalString;
		aux = originalString;
		while (!copyOfString.equals("")) {
			if (i >= copyOfString.length()) {
				result.add(copyOfString);
				copyOfString = "";
			} else {
				aux = copyOfString.substring(0, i + 1);
				lastSpace = aux.lastIndexOf(' ');
				if (lastSpace >= 0) {
					result.add(copyOfString.substring(0, lastSpace));
					copyOfString = copyOfString.substring(lastSpace + 1);
				} else {
					result.add(copyOfString.substring(0, i));
					copyOfString = copyOfString.substring(i);
				}
			}
		}
		return result;
	}
}
