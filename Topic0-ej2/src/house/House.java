package house;

import java.util.LinkedList;
import java.util.List;

import house.Partes.Floor;
import house.Partes.Roof;
import house.Partes.Wall;


public class House {
	  private Floor floor;
	  private List<Wall> walls;
	  private Roof roof;

	  public House() {
	    this.walls = new LinkedList<Wall>();
	  }

	  public void addWall(Wall wall) {
	    this.walls.add(wall);
	  }

	  public void setRoot(Roof roof) {
	    this.roof = roof;
	  }

	  public void setFloor(Floor floor) {
	    this.floor = floor;
	  }

	  @Override
	  public String toString() {
	    return "House {" + this.floor + ", " + this.walls + ", " + this.roof + "}";
	  }
	}