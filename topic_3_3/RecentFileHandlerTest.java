package topic_3_3;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 Use TDD to create the 'Recent file list' behaviour. Some examples of this behaviour is:
 When the program is run for the first time, the list is empty.
 When a file is opened, it is added to the recent file list.
 If an opened file already exists in the recent file list, it is bumped to the top, not duplicated in the list. 
 If the recent file list gets full (typical number of items is 15), the oldest item is removed when a new item is added.
 */

public class RecentFileHandlerTest {

	@Test
	public void test_FirstRun() {
		RecentFileHandler rfh = new RecentFileHandler();
		assertEquals(0, rfh.getFilesNumber());
	}

	@Test
	public void test_AddFile() {
		File f1 = new File ("a");
		RecentFileHandler rfh = new RecentFileHandler();
		rfh.addFile(f1);
		assertEquals(f1,rfh.getNewestFile());
	}
	
	@Test
	public void test_AddExistentFile() {
		File f1 = new File ("a");
		File f2 = new File ("b");
		File f3 = new File ("c");
		RecentFileHandler rfh = new RecentFileHandler(2);
		rfh.addFile(f1);
		rfh.addFile(f1);
		rfh.addFile(f2);
		rfh.addFile(f3);
		rfh.addFile(f1);
		List<File> expected = new ArrayList<File>();
		expected.add(0,f3);
		expected.add(0,f1);
		assertEquals(expected,rfh.getRecentFiles());
	}
}
