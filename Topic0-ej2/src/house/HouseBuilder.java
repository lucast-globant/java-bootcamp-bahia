package house;


public interface HouseBuilder {
	void buildFloor();
	void buildWalls();
	void buildRoof();

	House getHouse();
}
