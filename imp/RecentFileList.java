package imp;

import java.util.Vector;

public class RecentFileList {
	Vector<File> list;

	public RecentFileList() {
		this.list = new Vector<File>(15);
	}

	public RecentFileList(int capacity) {
		this.list = new Vector<File>(capacity);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.size() == list.capacity();
	}

	public int getSize() {
		return list.size();
	}

	public void open(File file) {
		int i = 0;
		boolean found = false;
		while (i < getSize() && !found) {
			if (list.get(i).equals(file)) {
				found = true;
				list.add(list.remove(i));
			}
			i++;
		}
		if (!found){
			if (isFull()){
				list.remove(0);
				list.add(file);
			}
			else
				list.add(file);
		}

	}
	public File getLastFile(){
		return this.list.lastElement();
	}
}
