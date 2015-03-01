package Topic_2.Ex_3;

import java.io.File;
import java.util.Vector;

public class RecentFileList {
	private Vector<File> fileList;

	public RecentFileList() {
		fileList = new Vector<File>(15);
	}

	public boolean isEmpty() {
		return fileList.isEmpty();
	}

	public boolean isFull() {
		return fileList.size() == fileList.capacity();
	}

	public int getSize() {
		return fileList.size();
	}

	public void add(File file) {
		if (fileList.contains(file))
			fileList.remove(file);
		if (isFull()) {
			fileList.remove(0);
			fileList.add(file);
		} else
			fileList.add(file);
	}

	public File getMostRecentFile() {
		if (isEmpty())
			return null;
		else
			return fileList.lastElement();
	}

	public Object getMostOldestFile() {
		return fileList.firstElement();
	}

}
