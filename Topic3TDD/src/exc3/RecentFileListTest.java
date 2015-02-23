package exc3;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class RecentFileListTest {

	@Test
	public void firstRunTest() {
		RecentFileList RecentFileList = new RecentFileList();
		assertEquals(true, RecentFileList.isEmpty());
	}

	@Test
	public void openFileTest() {
		RecentFileList RecentFileList = new RecentFileList();
		File file1 = new File("1");
		RecentFileList.openFile(file1);
		assertEquals(1, RecentFileList.getSize());
	}

	@Test
	public void openSameFileTest() {
		RecentFileList RecentFileList = new RecentFileList();
		File file1 = new File("2");
		File file2 = new File("2");
		RecentFileList.openFile(file1);
		RecentFileList.openFile(file2);
		assertEquals(1, RecentFileList.getSize());
	}

	@Test
	public void openMoreThan15Test() {
		RecentFileList RecentFileList = new RecentFileList();
		File file1 = new File("1");
		File file2 = new File("2");
		File file3 = new File("3");
		File file4 = new File("4");
		File file5 = new File("5");
		File file6 = new File("6");
		File file7 = new File("7");
		File file8 = new File("8");
		File file9 = new File("9");
		File file10 = new File("10");
		File file11 = new File("11");
		File file12 = new File("12");
		File file13 = new File("13");
		File file14 = new File("14");
		File file15 = new File("15");
		File file16 = new File("16");

		RecentFileList.openFile(file1);
		RecentFileList.openFile(file2);
		RecentFileList.openFile(file3);
		RecentFileList.openFile(file4);
		RecentFileList.openFile(file5);
		RecentFileList.openFile(file6);
		RecentFileList.openFile(file7);
		RecentFileList.openFile(file8);
		RecentFileList.openFile(file9);
		RecentFileList.openFile(file10);
		RecentFileList.openFile(file11);
		RecentFileList.openFile(file12);
		RecentFileList.openFile(file13);
		RecentFileList.openFile(file14);
		RecentFileList.openFile(file15);
		RecentFileList.openFile(file16);

		assertEquals(15, RecentFileList.getSize());
	}
}
