package day10_test;

public class PositivePoint extends PositivePointMain{
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0 || y<0) {
			super.move(0,0);
		}
	
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
