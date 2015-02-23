package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import imp.File;
import imp.RecentFileList;

import org.junit.Test;

public class RecentFileListTest {

	@Test
	public void check_empty_list() {
		RecentFileList recentFileList = new RecentFileList();
		boolean isEmpty = recentFileList.isEmpty();
		assertTrue(isEmpty);
	}

	@Test
	public void check_one_file() {
		RecentFileList recentFileList = new RecentFileList();
		File f1 = new File();
		recentFileList.open(f1);
		assertEquals(f1, recentFileList.getLastFile());
	}
	@Test
	public void check_dup_recent_file() {
		RecentFileList recentFileList = new RecentFileList();
		File f1 = new File();
		recentFileList.open(f1);
		recentFileList.open(f1);
		assertEquals(f1, recentFileList.getLastFile());
		assertEquals(1, recentFileList.getSize());
	}
	@Test
	public void check_dup_add_other_file() {
		RecentFileList recentFileList = new RecentFileList();
		File f1 = new File();
		File f2 = new File();
		recentFileList.open(f1);
		recentFileList.open(f1);
		assertEquals(f1, recentFileList.getLastFile());
		assertEquals(1, recentFileList.getSize());
		recentFileList.open(f2);
		assertEquals(f2, recentFileList.getLastFile());
		assertEquals(2, recentFileList.getSize());

	}
	@Test
	public void check_add_on_full_list() {
		RecentFileList recentFileList = new RecentFileList();
		File[] fileArray = new File[15];
		for (int i = 0; i < 15; i++) {
			fileArray[i] = new File();
			recentFileList.open(fileArray[i]);
			assertEquals(fileArray[i], recentFileList.getLastFile());
		}
		File f15= new File();
		assertEquals(true, recentFileList.isFull());
		recentFileList.open(f15);
		assertEquals(f15, recentFileList.getLastFile());

	}

}
