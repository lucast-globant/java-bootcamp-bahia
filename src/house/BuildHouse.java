package house;
import house.HouseBuilder;

public class BuildHouse {
	public House build(HouseBuilder builder) {
	    builder.buildFloor();
	    builder.buildWalls();
	    builder.buildRoof();
	    return builder.getHouse();
	  }
}
