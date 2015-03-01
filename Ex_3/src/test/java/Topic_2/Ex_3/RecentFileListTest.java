package Topic_2.Ex_3;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class RecentFileListTest {

	@Test
	public void firstTimeRecentFileList() {
		RecentFileList recentFileList = new RecentFileList();
		boolean isEmpty = recentFileList.isEmpty();
		assertTrue(isEmpty);
	}

	@Test
	public void addFileOpenToRecentFileList() {
		RecentFileList recentFileList = new RecentFileList();
		File file = new File("file");
		recentFileList.add(file);
		assertEquals(file, recentFileList.getMostRecentFile());
	}

	@Test
	public void addExistingFileToRecentFileList() {
		RecentFileList recentFileList = new RecentFileList();
		File file = new File("file");
		recentFileList.add(file);
		File file2 = new File("file2");
		recentFileList.add(file2);
		assertEquals(file2, recentFileList.getMostRecentFile());
		recentFileList.add(file);
		assertEquals(file, recentFileList.getMostRecentFile());
	}

	@Test
	public void addFileOpenToRecentFileListFull() {
		RecentFileList recentFileList = new RecentFileList();
		File file1 = new File("file1");
		recentFileList.add(file1);
		File file2 = new File("file2");
		recentFileList.add(file2);
		File file3 = new File("file3");
		recentFileList.add(file3);
		File file4 = new File("file4");
		recentFileList.add(file4);
		File file5 = new File("file5");
		recentFileList.add(file5);
		File file6 = new File("file6");
		recentFileList.add(file6);
		File file7 = new File("file7");
		recentFileList.add(file7);
		File file8 = new File("file8");
		recentFileList.add(file8);
		File file9 = new File("file9");
		recentFileList.add(file9);
		File file10 = new File("file10");
		recentFileList.add(file10);
		File file11 = new File("file11");
		recentFileList.add(file11);
		File file12 = new File("file12");
		recentFileList.add(file12);
		File file13 = new File("file13");
		recentFileList.add(file13);
		File file14 = new File("file14");
		recentFileList.add(file14);
		File file15 = new File("file15");
		recentFileList.add(file15);
		assertTrue(recentFileList.isFull());
		File file16 = new File("file");
		recentFileList.add(file16);
		assertEquals(file16, recentFileList.getMostRecentFile());
		assertFalse(file1.equals(recentFileList.getMostOldestFile()));
		assertTrue(file2.equals(recentFileList.getMostOldestFile()));
	}
}
