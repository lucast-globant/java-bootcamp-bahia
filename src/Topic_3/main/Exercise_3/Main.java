package Topic_3.main.Exercise_3;

public class Main {
	public static void main(String args[]) {
		// Create file manager
		FileManager fileManager = new FileManager();

		// Open files
		fileManager.openFile("testFile2");
		fileManager.openFile("testFile6");
		fileManager.openFile("testFile8");
		fileManager.openFile("testFile6");

		// Print recent list
		System.out.println(fileManager.getRecentList());
	}
}
