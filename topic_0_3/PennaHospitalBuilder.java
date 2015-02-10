package topic_0_3;

import java.util.ArrayList;

public class PennaHospitalBuilder implements HospitalBuilder{
	
	private Hospital hospital;
	
	public PennaHospitalBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildHospital() {
		hospital.setName("Penna");
		hospital.setDirector("Otero");
	}

	@Override
	public void buildDoctors() {
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor = new Doctor ("Franco",34879568,7182);
		doctors.add(doctor);
		doctor = new Doctor ("Carlos",24876911,3741);
		doctors.add(doctor);
		hospital.setDoctors(doctors);
	}

	@Override
	public void buildNurses() {
		ArrayList<Nurse> nurses = new ArrayList<Nurse>();
		Nurse nurse = new Nurse ("Fernando",25466352);
		nurses.add(nurse);
		nurse = new Nurse ("Gabriela",28745745);
		nurses.add(nurse);
		nurse = new Nurse ("Lucila",33421052);
		nurses.add(nurse);
		hospital.setNurses(nurses);		
	}

	@Override
	public void buildAreas() {
		AreaFactory areaFactory = new AreaFactory();
		
		Area emergencyRoom = areaFactory.getArea("er");
		((EmergencyRoom) emergencyRoom).setPatients(10);
		((EmergencyRoom) emergencyRoom).setCapacity(15);
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor = new Doctor ("Ivan",30754894,7002);
		doctors.add(doctor);
		((EmergencyRoom) emergencyRoom).setDoctors(doctors);
		ArrayList<Nurse> nurses = new ArrayList<Nurse>();
		Nurse nurse = new Nurse ("Martin",15240024);
		nurses.add(nurse);
		nurse = new Nurse ("Eduardo",26930031);
		nurses.add(nurse);
		((EmergencyRoom) emergencyRoom).setNurses(nurses);
		
		Area hospitalRoom1 = areaFactory.getArea("hr");
		((HospitalRoom) hospitalRoom1).setBeds(4);
		((HospitalRoom) hospitalRoom1).setPatients(3);
		nurses = new ArrayList<Nurse>();
		nurse = new Nurse ("Mariana",17175840);
		nurses.add(nurse);
		((HospitalRoom) hospitalRoom1).setNurses(nurses);
		Area hospitalRoom2 = areaFactory.getArea("hr");
		((HospitalRoom) hospitalRoom2).setBeds(2);
		((HospitalRoom) hospitalRoom2).setPatients(2);
		nurses = new ArrayList<Nurse>();
		nurse = new Nurse ("Belen",19784150);
		nurses.add(nurse);
		((HospitalRoom) hospitalRoom2).setNurses(nurses);
		
		Area intensiveCareUnit = areaFactory.getArea("icr");
		((IntensiveCareUnit) intensiveCareUnit).setPatients(10);
		((IntensiveCareUnit) intensiveCareUnit).setBeds(20);
		doctors = new ArrayList<Doctor>();
		doctor = new Doctor ("Sofia",36754194,7112);
		doctors.add(doctor);
		doctor = new Doctor ("Maria",20451287,6899);
		doctors.add(doctor);
		((IntensiveCareUnit) intensiveCareUnit).setDoctors(doctors);
		nurses = new ArrayList<Nurse>();
		nurse = new Nurse ("Florencia",34102102);
		nurses.add(nurse);
		((IntensiveCareUnit) intensiveCareUnit).setNurses(nurses);
		
		Area maternityWard = areaFactory.getArea("mw");
		((MaternityWard) maternityWard).setPatients(0);
		doctor = new Doctor ("Esteban",44512745,12450);
		((MaternityWard) maternityWard).setDoctor(doctor);
		nurses = new ArrayList<Nurse>();
		nurse = new Nurse ("Nicolas",29278133);
		nurses.add(nurse);
		((MaternityWard) maternityWard).setNurses(nurses);
		
		Area operatingRoom = areaFactory.getArea("or");
		((OperatingRoom) operatingRoom).setNumber(1);
		((OperatingRoom) operatingRoom).setPatients(1);
		((OperatingRoom) operatingRoom).setCapacity(2);
		doctor = new Doctor ("Ivan",30754894,7002);
		((OperatingRoom) operatingRoom).setDoctor(doctor);
		
		Area waitingRoom = areaFactory.getArea("wr");
		((WaitingRoom) waitingRoom).setName("Favaloro");
		((WaitingRoom) waitingRoom).setPatients(9);
		((WaitingRoom) waitingRoom).setCapacity(17);
		
		ArrayList<Area> areas = new ArrayList<Area>();
		areas.add(operatingRoom);
		areas.add(maternityWard);
		areas.add(intensiveCareUnit);
		areas.add(emergencyRoom);
		areas.add(waitingRoom);
		areas.add(hospitalRoom1);
		areas.add(hospitalRoom2);
		hospital.setAreas(areas);
		
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}
}
