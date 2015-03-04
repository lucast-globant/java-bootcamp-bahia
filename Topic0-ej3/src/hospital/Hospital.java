package hospital;

import java.util.LinkedList;
import java.util.List;

public class Hospital {
	  private List<Floor> floors;

	  public Hospital() {
		this.floors = new LinkedList<Floor>();
	  }

	  public void addFloor(Floor floor) {
	    this.floors.add(floor);
	  }
	  

	  @Override
	  public String toString() {
	    return "Hospital {Pisos:" + this.floors +"}";
	  }
}