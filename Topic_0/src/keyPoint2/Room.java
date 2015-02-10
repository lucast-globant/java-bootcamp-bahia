package keyPoint2;

import java.awt.Point;

public class Room {
	private Point point1, point2;

	public void Room(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public Point getPoint1() {
		return this.point1;
	}

	public Point getPoint2() {
		return this.point2;
	}
}
