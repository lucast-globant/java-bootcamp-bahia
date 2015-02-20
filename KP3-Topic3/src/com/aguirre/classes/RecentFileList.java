package com.aguirre.classes;

import java.io.File;
import java.util.Vector;

public class RecentFileList {

	private Vector<File> files;

	public RecentFileList() {
		files = new Vector<File>(15);
	}

	public boolean emptyList() {
		return files.isEmpty();
	}

	public boolean fullList() {
		return files.size() == files.capacity();
	}

	public int numberFiles() {
		return files.size();
	}

	public void addFile(File file) {
		boolean exists = false;
		int pos = 0;
		while ((pos < files.size()) && (!exists)) {
			if (files.get(pos).equals(file)) {
				exists = true;
				files.add(files.remove(pos));
			}
			pos++;
		}
		if (!exists) {
			if (files.size() == files.capacity()) {
				files.remove(0);
			}
			files.add(file);
		}
	}

	public File mostRecentFile() {
		if (files.isEmpty()) {
			return null;
		}
		return files.get(files.size() - 1);
	}

	public File oldestFile() {
		if (files.isEmpty()) {
			return null;
		}
		return files.get(0);
	}
}
