package convertion;



/**
 * A word-wrapping algorithm, which is given a string and a row-length, returns a list of word-wrapped rows.
 * @author Jordan
 *
 */
public class WordWrapper {
	private static String delimiter=","; //the delimiter used to separate the word-wrapping

	public static String wrap(String string, int i) {
		String res="";
		res=wrapString(string, delimiter, i);
		return res;
	}
	
	private static String wrapString(String s, String deliminator, int length) {
		
	    String result = "";
	    int lastdelimPos = 0;
	    for (String token : s.split(" ", -1)) {
	    	if ((result.length() - lastdelimPos + token.length() >= length)) {
	               	lastdelimPos = result.length()+1; 
			        if(token.length()>length){
				    		result += (result.isEmpty() ? "" : deliminator)+caseVeryLarge(token, length, result);
				    }
			        else
			        		result += (result.isEmpty() ? "" : deliminator)+ token;

	            
	        }
	        else {
	            result += (result.isEmpty() ? "" : " ") + token;
	        }
	         
	    }
	    return result;
	}

	private static String caseVeryLarge(String token, int i, String res) {
		String result="";
		int index=0;
		for (char c : token.toCharArray()) {
			if(index<i){
				result+=c;
				index++;
			}
			else{
				result+=delimiter+c;
				index=0;
			}
		}
		return result;
	}

}
