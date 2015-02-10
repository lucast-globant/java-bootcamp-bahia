package topic_0_3;

public interface HospitalBuilder {
	public abstract void buildHospital(); //to set name and director
	public abstract void buildDoctors();
	public abstract void buildNurses();
	public abstract void buildAreas();
	public Hospital getHospital();
}
