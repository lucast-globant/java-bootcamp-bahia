package imp;

import java.util.ArrayList;
import java.util.List;

public class WordWrapper {

	public List<String> wrapTxt(String text, int rowLength) {
		List<String> ret = new ArrayList<String>();
		if (rowLength > text.length())
			ret.add(text);
		else {
			String result = "";
			String aux = "";
			int i = 0;
			String[] noSpaces = text.split(" ");
			while (i < noSpaces.length) {
				if (noSpaces[i].length() <= rowLength - result.length() - 1) {
					if (result.length() == 0)
						result = result + noSpaces[i];
					else
						result = result + " " + noSpaces[i];
					i++;
				} else {
					if (rowLength <= noSpaces[i].length() && result.length() + 1 < rowLength) {
						aux = noSpaces[i].substring(0, rowLength - result.length());
						noSpaces[i] = noSpaces[i].substring(aux.length(), noSpaces[i].length());
						if (result.length() != 0)
							result += " ";
						result += aux;
					}
					ret.add(result);
					result = "";

				}
			}
			if (result.length() > 0)
				ret.add(result);

		}
		return ret;

	}
}
