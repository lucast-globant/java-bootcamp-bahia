package topic_3_3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecentFileHandler {

	private List<File> recentFileList;
	private int max;
	
	public RecentFileHandler() {
		recentFileList = new ArrayList<File>();
		this.max = 15;
	}
	
	public RecentFileHandler(int max) {
		recentFileList = new ArrayList<File>();
		this.max = max;
	}

	public int getFilesNumber() {
		return recentFileList.size();
	}

	public void addFile(File file) {
		recentFileList.remove(file);
		recentFileList.add(0,file);
		checkFull();
	}

	public File getNewestFile() {
		return recentFileList.get(0);
	}
	
	public File getOldestFile() {
		return recentFileList.get(recentFileList.size()-1);
	}

	private void checkFull() {
		if (getFilesNumber() > max)
			recentFileList.remove(getOldestFile());
	}

	public List<File> getRecentFiles() {
		return recentFileList;
	}
}
