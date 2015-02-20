package Topic_2.Ex_2;

import java.util.ArrayList;
import java.util.List;

public class WordWrapping {

	public List<String> wordWrapAlgorithm(int rowLength, String words) {
		List<String> toReturn = new ArrayList<String>();
		if (rowLength > words.length())
			toReturn.add(words);
		else {
			String result = "", aux = "";
			String[] splited = words.split(" ");
			int index = 0;
			while (index < splited.length) {
				// if word can enter
				if (splited[index].length() <= rowLength - result.length() - 1) {
					if (result.length() == 0) // if result don't contains words
						result += splited[index];
					else
						// if result contains word
						result += " " + splited[index];
					index++;
				} else {
					// if word can't enter in a empty row
					if (rowLength <= splited[index].length() && result.length() + 1 < rowLength) {
						aux = splited[index].substring(0, rowLength - result.length());
						splited[index] = splited[index].substring(aux.length(), splited[index].length());
						if (result.length() != 0)
							result += " ";
						result += aux;
					}
					// if word can enter in a empty row or the word was split
					toReturn.add(result);
					result = "";
				}

			}
			if (result.length() > 0)
				toReturn.add(result);
		}
		return toReturn;
	}

}
