package keyPoint2;

import java.awt.Point;

public class Room {
	private Point point1, point2;
	private String name;

	public Room(Point point1, Point point2, String name) {
		this.point1 = point1;
		this.point2 = point2;
		this.name = name;
	}

	public Point getPoint1() {
		return this.point1;
	}

	public Point getPoint2() {
		return this.point2;
	}
	
	public String getName() {
		return this.name;
	}
}
