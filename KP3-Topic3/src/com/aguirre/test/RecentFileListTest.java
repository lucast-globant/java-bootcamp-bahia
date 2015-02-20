package com.aguirre.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.aguirre.classes.RecentFileList;

public class RecentFileListTest {

	@Test
	public void emptyList() {
		RecentFileList list = new RecentFileList();
		assertTrue("The list isn't empty", list.emptyList());
		assertTrue("The list should not have elements", list.numberFiles() == 0);
	}

	@Test
	public void oneFile() {
		RecentFileList list = new RecentFileList();
		File f1 = new File("F1");
		list.addFile(f1);
		assertTrue("The list should have one element", list.numberFiles() == 1);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f1));
	}

	@Test
	public void twoFiles() {
		RecentFileList list = new RecentFileList();
		File f1 = new File("F1");
		list.addFile(f1);
		assertTrue("The list should have one element", list.numberFiles() == 1);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f1));
		File f2 = new File("F2");
		list.addFile(f2);
		assertTrue("The list should have two elements", list.numberFiles() == 2);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f2));
	}

	@Test
	public void addExistingFile() {
		RecentFileList list = new RecentFileList();
		File f1 = new File("F1");
		list.addFile(f1);
		assertTrue("The list should have one element", list.numberFiles() == 1);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f1));
		File f2 = new File("F2");
		list.addFile(f2);
		assertTrue("The list should have two elements", list.numberFiles() == 2);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f2));
		list.addFile(f1);
		assertTrue("The list should have one element", list.numberFiles() == 2);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f1));
	}

	@Test
	public void fullList() {
		RecentFileList list = new RecentFileList();
		File f1 = new File("F1");
		list.addFile(f1);
		assertTrue("The list should have one element", list.numberFiles() == 1);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f1));
		File f2 = new File("F2");
		list.addFile(f2);
		assertTrue("The list should have one element", list.numberFiles() == 2);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f2));
		File f3 = new File("F3");
		list.addFile(f3);
		assertTrue("The list should have one element", list.numberFiles() == 3);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f3));
		File f4 = new File("F4");
		list.addFile(f4);
		assertTrue("The list should have one element", list.numberFiles() == 4);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f4));
		File f5 = new File("F5");
		list.addFile(f5);
		assertTrue("The list should have one element", list.numberFiles() == 5);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f5));
		File f6 = new File("F6");
		list.addFile(f6);
		assertTrue("The list should have one element", list.numberFiles() == 6);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f6));
		File f7 = new File("F7");
		list.addFile(f7);
		assertTrue("The list should have one element", list.numberFiles() == 7);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f7));
		File f8 = new File("F8");
		list.addFile(f8);
		assertTrue("The list should have one element", list.numberFiles() == 8);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f8));
		File f9 = new File("F9");
		list.addFile(f9);
		assertTrue("The list should have one element", list.numberFiles() == 9);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f9));
		File f10 = new File("F10");
		list.addFile(f10);
		assertTrue("The list should have one element", list.numberFiles() == 10);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f10));
		File f11 = new File("F11");
		list.addFile(f11);
		assertTrue("The list should have one element", list.numberFiles() == 11);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f11));
		File f12 = new File("F12");
		list.addFile(f12);
		assertTrue("The list should have one element", list.numberFiles() == 12);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f12));
		File f13 = new File("F13");
		list.addFile(f13);
		assertTrue("The list should have one element", list.numberFiles() == 13);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f13));
		File f14 = new File("F14");
		list.addFile(f14);
		assertTrue("The list should have one element", list.numberFiles() == 14);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f14));
		File f15 = new File("F15");
		list.addFile(f15);
		assertTrue("The list should have one element", list.numberFiles() == 15);
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f15));

		assertTrue("The list should be full", list.fullList());
		assertTrue("The oldest file should be File 1", list.oldestFile().equals(f1));
		File f16 = new File("F16");
		list.addFile(f16);
		assertTrue("The list should be full", list.fullList());
		assertTrue("The oldest file should be File 2", list.oldestFile().equals(f2));
		assertTrue("The most recent file is incorrect", list.mostRecentFile().equals(f16));
	}
}
