package key_three;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileListControlTest {

	@Test
	public void testFirstRun() {
		ControlFileHandler controlFileHandler = new ControlFileHandler();
		assertEquals(0, controlFileHandler.recentUsedFiles());
	}

	@Test
	public void testOpenFile() {
		ControlFileHandler controlFileHandler = new ControlFileHandler();
		File file1 = new File("BocaReyDeCopas.txt");
		controlFileHandler.addFile(file1);
		assertEquals(1, controlFileHandler.recentUsedFiles());
	}

	@Test
	public void testOpenSameFileTwice() {
		ControlFileHandler controlFileHandler = new ControlFileHandler();
		File file1 = new File("BocaReyDeCopas.txt");
		File file2 = new File("BocaReyDeCopas.txt");
		controlFileHandler.addFile(file1);
		controlFileHandler.addFile(file2);
		assertEquals(1, controlFileHandler.recentUsedFiles());
	}

	@Test
	public void testOpen18Files() {
		ControlFileHandler controlFileHandler = new ControlFileHandler();
		File file1 = new File("BocaReyDeCopas.txt");
		File file2 = new File("BocaReyDeCopas1.txt");
		File file3 = new File("BocaReyDeCopas2.txt");
		File file4 = new File("BocaReyDeCopas3.txt");
		File file5 = new File("BocaReyDeCopas4.txt");
		File file6 = new File("BocaReyDeCopas5.txt");
		File file7 = new File("BocaReyDeCopas6.txt");
		File file8 = new File("BocaReyDeCopas7.txt");
		File file9 = new File("BocaReyDeCopas8.txt");
		File file10 = new File("BocaReyDeCopas9.txt");
		File file11 = new File("BocaReyDeCopas10.txt");
		File file12 = new File("BocaReyDeCopas11.txt");
		File file13 = new File("BocaReyDeCopas12.txt");
		File file14 = new File("BocaReyDeCopas13.txt");
		File file15 = new File("BocaReyDeCopas14.txt");
		File file16 = new File("BocaReyDeCopas15.txt");
		File file17 = new File("BocaReyDeCopas16.txt");
		File file18 = new File("BocaReyDeCopas17.txt");
		controlFileHandler.addFile(file1);
		controlFileHandler.addFile(file2);
		controlFileHandler.addFile(file3);
		controlFileHandler.addFile(file4);
		controlFileHandler.addFile(file5);
		controlFileHandler.addFile(file6);
		controlFileHandler.addFile(file7);
		controlFileHandler.addFile(file8);
		controlFileHandler.addFile(file9);
		controlFileHandler.addFile(file10);
		controlFileHandler.addFile(file11);
		controlFileHandler.addFile(file12);
		controlFileHandler.addFile(file13);
		controlFileHandler.addFile(file14);
		controlFileHandler.addFile(file15);
		controlFileHandler.addFile(file16);
		controlFileHandler.addFile(file17);
		controlFileHandler.addFile(file18);
		assertEquals(15, controlFileHandler.recentUsedFiles());
	}

}
