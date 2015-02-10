package key2;

public class BrickBuilder extends HouseBuilder {

	@Override
	public House createHouse() {
		return new BrickHouse();
	}

	@Override
	public Floor createFloor() {
		// TODO Auto-generated method stub
		return new BrickFloor();
	}

	@Override
	public Walls createWalls() {
		// TODO Auto-generated method stub
		return new BrickWalls();
	}

	@Override
	public Roof createRoof() {
		// TODO Auto-generated method stub
		return new BrickRoof();
	}
	
}
