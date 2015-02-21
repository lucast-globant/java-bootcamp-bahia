package keyPoint3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUFileTest {

	// When the program is run for the first time, the list is empty
	@Test
	public void testFirstTimeOpen() {
		FileWindow fileWindow = new FileWindow();
		assertEquals(true, fileWindow.isEmpty());
	}

	// When a file is opened, it is added to the recent file list.
	@Test
	public void testFileOpened() {
		String path = "C:\\Temp\\example1.txt";
		FileWindow fileWindow = new FileWindow();
		fileWindow.openFile(path);
		boolean fileIsInWindow = fileWindow.exists(path);
		assertEquals(true, fileIsInWindow);
	}

	// If an opened file already exists in the recent file list, it is bumped to
	// the top, not duplicated in the list.
	@Test
	public void testFileAlreadyExists() {
		String path1 = "C:\\Temp\\example1.txt";
		String path2 = "C:\\Temp\\example2.txt";
		String path3 = "C:\\Temp\\example3.txt";
		FileWindow fileWindow = new FileWindow();
		fileWindow.openFile(path1);
		fileWindow.openFile(path2);
		fileWindow.openFile(path3);
		fileWindow.openFile(path2);
		assertEquals(path2, fileWindow.getLRUPathFile());
	}

	// If the recent file list gets full (typical number of items is 15), the
	// oldest item is removed when a new item is added.
	@Test
	public void testFullList() {
		String path = "C:\\Temp\\example%d.txt";
		FileWindow fileWindow = new FileWindow();
		for (int i = 1; i <= 16; i++) {
			fileWindow.openFile(String.format(path, i));
		}
		assertEquals("C:\\Temp\\example16.txt", fileWindow.getLRUPathFile());
		assertEquals(false, fileWindow.exists("C:\\Temp\\example1.txt"));
	}
}
