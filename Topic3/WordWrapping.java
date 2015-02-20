
public class WordWrapping {
	

	public String[] getWords(int rowLength, String text) {
		String result;
		String[] words;
		int i = 0;

		StringBuilder sb = new StringBuilder(text);	
		
		while (i + rowLength < sb.length() && (i = sb.lastIndexOf(" ", i + rowLength)) != -1) {
			
			i++;
		    sb.replace(i-1, i , "\n");
		}

		if(sb.lastIndexOf(" ", i + rowLength) != -1){
			result=sb.toString();
			words=result.split("\n");
		}
		else{
			result=sb.toString();
			
			words=new String[2];
			words[0]=result.substring(0, rowLength);
			words[1]=result.substring(rowLength, result.length());
		}
		return words;	
			
	}

}