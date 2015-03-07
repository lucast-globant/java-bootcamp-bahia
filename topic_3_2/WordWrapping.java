package topic_3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WordWrapping {

	public static List<String> wrap (String input, int rows)
	{
		List<String> words = new ArrayList<String>(); 
		if(input.length() < rows) {
			words.add(input);
		} else {
			StringTokenizer st=new StringTokenizer(input);
			String word;
			while(st.hasMoreTokens()) {			
				word=st.nextToken();
				if(word.length()<=rows) {
					while((word.length()<rows-1) && st.hasMoreTokens()) {
						word+=" "+st.nextToken();
					}
					words.add(word);
				} else {
					String separateWordA = word.substring(0, rows);
					String separateWordB= word.substring(rows);
					word=separateWordA;
					words.add(word);
					if(!st.hasMoreTokens())
						words.add(separateWordB);
				}
			}
		}
		return words;
	}
}