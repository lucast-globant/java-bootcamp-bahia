package list.test;

import static org.junit.Assert.*;

import java.io.File;

import list.RecentFileList;

import org.junit.Test;

public class RecentFileListTest {

	@Test
	public void firstRunningTest() {
		RecentFileList fileList = new RecentFileList ();
		assertEquals ("Running for first time",true,fileList.isEmpty());
	}
	
	@Test
	public void openFileTest() {
		RecentFileList fileList = new RecentFileList ();
		File f1 = new File ("File 1"),
		f2 = new File ("File 2");
		fileList.opennedFile (f1.getName());
		fileList.opennedFile (f2.getName());
		assertEquals ("Openned file",false,fileList.isEmpty());
		assertEquals ("Openned file",f2.getName(),fileList.top().getName());
	}
	
	@Test
	public void openExistingFileTest() {
		RecentFileList fileList = new RecentFileList ();
		File f1 = new File ("File 1"),
		f2 = new File ("File 2");
		fileList.opennedFile (f1.getName());
		fileList.opennedFile (f2.getName());
		fileList.opennedFile (f1.getName());
		assertEquals ("Openned existing file",f1.getName(),fileList.top().getName());
		fileList.opennedFile (f2.getName());
		assertEquals ("Openned existing file",f2.getName(),fileList.top().getName());
		assertEquals ("Openned existing file",1,fileList.contains (f1.getName()));
	}
	
	public void fullyFileTest() {
		RecentFileList fileList = new RecentFileList ();
		File f1 = new File ("File 1"),
		f2 = new File ("File 2"),
		f3 = new File ("File 3"),
		f4 = new File ("File 4"),
		f5 = new File ("File 5"),
		f6 = new File ("File 6"),
		f7 = new File ("File 7"),
		f8 = new File ("File 8"),
		f9 = new File ("File 9"),
		f10 = new File ("File 10"),
		f11 = new File ("File 11"),
		f12 = new File ("File 12"),
		f13 = new File ("File 13"),
		f14 = new File ("File 14"),
		f15 = new File ("File 15"),
		f16 = new File ("File 16");
		fileList.opennedFile (f1.getName());
		fileList.opennedFile (f2.getName());
		fileList.opennedFile (f3.getName());
		fileList.opennedFile (f4.getName());
		fileList.opennedFile (f5.getName());
		fileList.opennedFile (f6.getName());
		fileList.opennedFile (f7.getName());
		fileList.opennedFile (f8.getName());
		fileList.opennedFile (f9.getName());
		fileList.opennedFile (f10.getName());
		fileList.opennedFile (f11.getName());
		fileList.opennedFile (f12.getName());
		fileList.opennedFile (f13.getName());
		fileList.opennedFile (f14.getName());
		assertEquals ("Openned existing file",1,fileList.contains (f1.getName()));
		fileList.opennedFile (f15.getName());
		assertEquals ("Openned existing file",1,fileList.contains (f1.getName()));
		fileList.opennedFile (f16.getName());
		assertEquals ("Openned existing file",0,fileList.contains (f1.getName()));
		assertEquals ("Openned file",f16.getName(),fileList.top().getName());
	}


}