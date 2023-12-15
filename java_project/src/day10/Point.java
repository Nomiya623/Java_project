package day10;

public class Point extends Object {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x는  " + x + "y는  " + y + " 입니다.";
	}
}