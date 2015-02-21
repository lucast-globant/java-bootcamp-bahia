package Topic_3.main.Exercise_3;

import java.io.File;
import java.util.List;

public class FileManager {

	private List<File> recentList = new RecentList<File>(15);

	public void openFile(String filename) {
		File file = new File(filename);

		recentList.add(file);
	}

	public List<File> getRecentList() {
		return recentList;
	}
}
