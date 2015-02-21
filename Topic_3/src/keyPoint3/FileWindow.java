package keyPoint3;

import java.util.ArrayList;
import java.util.List;

// This class represents the list of last recently used files. 
// It is implemented as an Array List and the order is as follows: 
// the last object in the list is the last recently used file. 
// The object before it is the second last recently used file and so on.
// When the file to be opened already exists in the list, it is moved to
// the last place and the others remain in the same relative position.

public class FileWindow {
	private static FileWindow instance = null;
	private List<String> filesOpened;
	private int maxNumberOfFiles = 15;

	protected FileWindow() {
		filesOpened = new ArrayList<String>();
	}

	public FileWindow getInstance() {
		if (instance == null) {
			instance = new FileWindow();
		}
		return instance;
	}

	public int getSize() {
		return filesOpened.size();
	}

	public void openFile(String path) {
		int index = getIndexOf(path);
		if (index != -1) {
			String file = filesOpened.get(index);
			filesOpened.remove(index);
			filesOpened.add(file);
		} else {
			if (this.getSize() == maxNumberOfFiles)
			{
				filesOpened.remove(0);
			}
			filesOpened.add(path);
		}
	}
	
	public int getIndexOf(String path){
		return filesOpened.indexOf(path);
	}

	public boolean exists(String path) {
		return (filesOpened.indexOf(path) != -1);
	}

	public Object isEmpty() {
		return filesOpened.isEmpty();
	}

	public Object getLRUPathFile() {
		return filesOpened.get(filesOpened.size() - 1);
	}

}
