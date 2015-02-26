package hospital;

public class ImpHospitalBuilder implements HospitalBuilder {
	  private Hospital hospital;

	  public ImpHospitalBuilder() {
	    this.hospital = new Hospital();
	  }

	  public void buildFloors() {
		  FloorFactory floorFactory = new FloorFactory();
		  for (int i = 1 ; i < 4; i++)
	    	if (i == 1) {
	    		this.hospital.addFloor(floorFactory.getFloor("Intensive Care"));
	    	}
	    	else{
	    		if (i==2){
		    		this.hospital.addFloor(floorFactory.getFloor("Intermediate Care"));
	    		}
	    		else{
	    			if (i==3){
			    		this.hospital.addFloor(floorFactory.getFloor("Neonatology"));
	    			}
	    			
	    		}
	    	}
	  }


	  public Hospital getHospital() {
	    return this.hospital;
	  }
	}
