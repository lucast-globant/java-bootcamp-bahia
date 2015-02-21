package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import recentList.RecentList;

public class _RecentList {

	/**
	 * When the program is run for the first time, the list is empty.
	 */
	@Test
	public void firstRun() {
		RecentList rl=new RecentList();
		assertEquals(true, rl.empty() );
		
	}

	/**
	 * When a file is opened, it is added to the recent file list.
	 */
	@Test
	public void fileOpened() {
		RecentList rl=new RecentList();
		File f1=new File("hola.txt");
		rl.openFile(f1);
		assertEquals(1, rl.getActualSize());
	}

	/**
	 * If an opened file already exists in the recent file list,
	 *  it is bumped to the top, not duplicated in the list. 
	 *  
	 */
	@Test
	public void reOpenFile() {
		RecentList rl=new RecentList();
		File f1=new File("hola.txt");
		rl.openFile(f1);
		rl.openFile(f1);
		assertEquals(1, rl.getActualSize());
		
	}


	/**
	 * If the recent file list gets full (typical number of items is 15),
	 *   the oldest item is removed when a new item is added. 
	 */
	@Test
	public void fullList() {
		RecentList rl=new RecentList(3);
		File f1=new File("hola.txt");
		File f2=new File("file2.txt");
		File f3=new File("file3.txt");
		File f4=new File("file4.txt");
		rl.openFile(f1);
		rl.openFile(f2);
		rl.openFile(f3);
		rl.openFile(f4);
		assertEquals(3, rl.getActualSize());		
		assertEquals(false, rl.isRecentOpened(f1));
		assertEquals(f4, rl.lastOpened());
	}
}
