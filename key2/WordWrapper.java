package topic3.key2;

public class WordWrapper {

	public static String wrap(String sentence, int rows) {
		if (sentence.length() <= rows) {
			return sentence; 
		}else {
			String firstLine = sentence.substring(0, rows+1);
			int space = firstLine.lastIndexOf(' ');
			if (space != -1) {
				return sentence.substring(0, space)+", "+wrap(sentence.substring(space+1),rows); 
			}
			if (sentence.charAt(rows) == ' ') {
				return sentence.substring(0, rows)+", "+wrap(sentence.substring(rows+1),rows);
			}
			return sentence.substring(0, rows)+", "+wrap(sentence.substring(rows),rows);
		}
	}

}
