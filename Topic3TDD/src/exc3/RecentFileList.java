package exc3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecentFileList {

	List<File> files;
	int capacity;

	public RecentFileList() {
		files = new ArrayList<File>();
		capacity = 15;

	}

	public boolean isEmpty() {
		return files.isEmpty();
	}

	public boolean isFull() {
		return files.size() == capacity;
	}

	public void openFile(File file) {

		int index = 0;
		boolean exist = false;

		while (index < getSize() && !exist) {

			if (files.get(index).equals(file)) {
				exist = true;
				files.add(files.remove(index));
			}
			index++;
		}
		if (!exist) {
			if (isFull()) {
				files.remove(0);
				files.add(file);
			} else
				files.add(file);
		}

	}

	public int getSize() {

		return files.size();
	}

	public List<File> getFileList() {
		return files;
	}

}
