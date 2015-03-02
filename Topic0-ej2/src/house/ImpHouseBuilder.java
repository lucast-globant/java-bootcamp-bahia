package house;
import house.Partes.*;

public class ImpHouseBuilder implements HouseBuilder {
	  private House house;

	  public ImpHouseBuilder() {
	    this.house = new House();
	  }

	  public void buildWalls() {
	    for (int i = 0; i < 4; i++)
	      this.house.addWall(new Wall());
	  }

	  public void buildRoof() {
	    this.house.setRoot(new Roof());
	  }
	  
	  public void buildFloor() {
		    this.house.setFloor(new Floor());
		  }

	  public House getHouse() {
	    return this.house;
	  }
	}
