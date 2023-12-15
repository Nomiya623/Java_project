package day10_test;

public class MainPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		   cp.setXY(10, 20);
		   cp.setColor("RED");
		   String str = cp.toString();
		   System.out.println(str+"입니다. ");	
	}

//	ColorPoint zeroPoint = new ColorPoint(); // (0,0) BLACK point
//    System.out.println(zeroPoint.toString() + " is.");
//    ColorPoint cp = new ColorPoint(10, 10); // (10,10) BLACK point
//    cp.setXY(5, 5);
//    cp.setColor("RED");
//    System.out.println(cp.toString() + " is.");
	
	
	
	
	
}
