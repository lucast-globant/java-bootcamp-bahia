package key_three;

import java.io.File;
import java.util.LinkedList;

public class ControlFileHandler {

	private LinkedList<File> fileList;
	private static final int maxAmount = 15;

	public ControlFileHandler() {
		fileList = new LinkedList<File>();
	}

	public int recentUsedFiles() {
		return fileList.size();
	}

	public void addFile(File file1) {
		fileList.remove(file1);
		fileList.addFirst(file1);
		if (fileList.size() > maxAmount) {
			fileList.removeLast();
		}
	}

}
