package mongodb;

public class StudentCourse {

	private String studentId;
	private int first_parcial;
	private int second_parcial;
	private int third_parcial;
	private int final_exam;
	
	public StudentCourse(String studentId, int first_parcial, int second_parcial, int third_parcial,
			int final_exam){
		this.studentId=studentId;
		this.first_parcial=first_parcial;
		this.second_parcial=second_parcial;
		this.third_parcial=third_parcial;
		this.final_exam=final_exam;
	}
	
	public String getStudentID(){
		return studentId;
	}
	
	public int getFinalExam(){
		return final_exam;
	}
}
