package jdbc;


public class client {
	
	public static void main(String[] args){
		HighschoolService hs=new HighschoolService();
		hs.showCourseData(1);

		hs.showFinalNotes(1);
	}
	
}
