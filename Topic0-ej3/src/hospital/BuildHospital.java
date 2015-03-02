package hospital;
import hospital.HospitalBuilder;

public class BuildHospital {
	public Hospital build(HospitalBuilder builder) {
	    builder.buildFloors();
	    return builder.getHospital();
	  }
}
