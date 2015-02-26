package hospital;

import hospital.floortypes.IntensiveCare;
import hospital.floortypes.IntermediateCare;
import hospital.floortypes.Neonatology;

public class FloorFactory {
	public Floor getFloor(String floortype){
	      if(floortype == null){
	         return null;
	      }		
	      if(floortype.equalsIgnoreCase("Intensive Care")){
	         return new IntensiveCare();
	         
	      } else if(floortype.equalsIgnoreCase("Intermediate Care")){
	         return new IntermediateCare();
	         
	      } else if(floortype.equalsIgnoreCase("Neonatology")){
	         return new Neonatology();
	      }
	      
	      return null;
	}
}

