package topic_0_3;

public class AreaFactory {
	public Area getArea(String type) {
		if (type.equals("er"))
			return new EmergencyRoom();
		else
			if (type.equals("icr"))
				return new IntensiveCareUnit();
			else
				if (type.equals("mw"))
					return new MaternityWard();
				else
					if (type.equals("hr"))
						return new HospitalRoom();
					else
						if (type.equals("or"))
							return new OperatingRoom();
						else
							return new WaitingRoom();
	}
}
