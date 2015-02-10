package Exercise_3;

public class HospitalFactory {

	public Hospital createHospital(HospitalTypes.HospitalType hospitalType) {

		Class concreteClass = HospitalTypes.enumToConcreteClass.get(hospitalType);

		Hospital hospital = null;
		try {
			hospital = (Hospital) concreteClass.getConstructor().newInstance();
		} catch (Exception e) {
			hospital = new ChildrenHospital();
		}

		return hospital;
	}

}
