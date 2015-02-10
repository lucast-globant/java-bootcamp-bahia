
public class buildingFactory {
	
	public building getBuilding(String type) {
		if ("hospital building".equals(type)) {
			return new hospital();
		} else {
			return null;
		}
	}
	
}
