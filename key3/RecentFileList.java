package topic3.key3;

import java.util.ArrayList;
import java.util.List;

public class RecentFileList {
	
	private List<File> filesList;
	
	public RecentFileList () {
		filesList = new ArrayList <File> ();
	}

	public boolean isEmpty() {
		return filesList.isEmpty();
	}

	public void opennedFile(String file) {
		if (filesList.size() >= 15)  {
			filesList.remove(15);
		}
		if (contains(file) > 0) { 
			removeFile(file);
		}
		filesList.add(0,new File (file));
	}

	public void removeFile (String file) {
		List<File> filesAux = new ArrayList <File> ();	
		for (File f: filesList) {
			if (!f.getName().equals(file)) {
				filesAux.add(f);
			}
		}
		filesList = filesAux;
	}
	
	public File top() {
		return filesList.get(0);
	}
	
	public int contains(String file) {
		int i = 0;
		for (File f: filesList) {
			if (f.getName().equals(file)) {
				i++;
			}
		}
		return i;
	}
	
	public String toString () {
		String s = "";
		for (File f: filesList) {
			s+=f.getName()+" ";
		}
		return s;
	}

}
