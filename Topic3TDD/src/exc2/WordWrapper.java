package exc2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WordWrapper {

	public static List<String> wrapper(String string, Integer rowLength) {

		List<String> result = new ArrayList<String>();
		StringTokenizer token = new StringTokenizer(string, " ");

		if (string.length() <= rowLength) {
			result.add(string);
		} else {

			String word = "";

			while (token.hasMoreTokens()) {

				String nextToken = token.nextToken();

				if ((!"".equals(word)) && ((word.length() + nextToken.length() + 1) > rowLength)) {
					result.add(word);
					word = "";
				}
				if (nextToken.length() <= rowLength) {
					if (word.length() > 0) {
						word += " ";
					}
					word += nextToken;
				} else {
					String trim = nextToken;
					while (trim.length() > rowLength) {
						result.add(trim.substring(0, rowLength));
						trim = trim.substring(rowLength);
					}
					word = trim;
				}
			}
			if (!"".equals(word)) {
				result.add(word);
			}
		}
		return result;
	}

}
