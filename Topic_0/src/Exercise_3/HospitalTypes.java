package Exercise_3;

import java.util.HashMap;
import java.util.Map;

public class HospitalTypes {

	public enum HospitalType {
		SENIORS,
		CHILDREN,
		REHABILITAION
	}

	static Map<HospitalType, Class> enumToConcreteClass;

	static {
		enumToConcreteClass = new HashMap<HospitalType, Class>(5);

		enumToConcreteClass.put(HospitalType.SENIORS, SeniorsHospital.class);
		enumToConcreteClass.put(HospitalType.CHILDREN, ChildrenHospital.class);
		enumToConcreteClass.put(HospitalType.REHABILITAION, RehabilitationHospital.class);
	}
}
