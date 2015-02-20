package topic_3_2;

public class WordWrapping {

	public WordWrapping() {}

	public String wrapAlg (String word, int row_length) {
		String result = "";
		if(row_length>word.length())
			result=word;
		else {
			int endIndex = row_length;
			int i = 0;
			while (i<word.length()/row_length) {		
				String sub_word;
				if (i==0) {
					sub_word = word.substring(i*row_length, endIndex);
					result+=("\""+sub_word+"\""); 
				} else {
					sub_word = word.substring(i*row_length+i, endIndex);
					result+=(", \""+sub_word+"\"");
				}					
				i++;
				endIndex+=row_length+1;
			}
			if((i*row_length+i)%row_length!=0)
				result+=(", \""+word.substring(i*row_length, word.length())+"\"");
		}
		return result;
	}
}
