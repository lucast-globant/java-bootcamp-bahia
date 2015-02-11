package keyPoint3;

public class AreaFactory {
private static AreaFactory areaFactory = null;

private AreaFactory() {
}

public static AreaFactory getInstance() {
	if (areaFactory == null) {
		areaFactory = new AreaFactory();
	}
	return areaFactory;
}

public Area getArea(AreaType type) {
	Area area;
	switch (type) {
	case SURGERY: area = new Surgery(); 
		break; 
	case EMERGENCY: area = new Emergency();
		break; 
	case  WARD: area = new  Ward();
		break; 
	case  ICU: area = new ICU();
		break; 
	case  MATERNITYWARD: area = new MaternityWard(); 
		break; 
	case CONSULTING: area = new Consulting();
		break; 
	case PHARMACY: area = new Pharmacy();
		break; 
	default: area = null;
	}
	return area;
}
}