package day8;

public class ColorPoint extends Point {
	//showCiki
	private String color;
	
	ColorPoint(int x, int y, String color){
		super (x,y);
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	void showColorPoint() {
//		showSystem.out.println(getX() + "," + getY());
//	}
	
	void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
	
	  
	
	
}
