package test;

public class WordWrapper {

	public static String wrap(String sentence, int columns) {
		if (sentence.length() <= columns) {
			return sentence; 
		}else {
			String firstLine = sentence.substring(0, columns+1);
			int space = firstLine.lastIndexOf(' ');
			if (space != -1) {
				return sentence.substring(0, space)+", "+wrap(sentence.substring(space+1),columns); 
			}
			if (sentence.charAt(columns) == ' ') {
				return sentence.substring(0, columns)+", "+wrap(sentence.substring(columns+1),columns);
			}
			return sentence.substring(0, columns)+" "+wrap(sentence.substring(columns),columns);
		}
	}
}
