package day8;

public class Point_Main {

	public static void main(String[] args, String green) {
		// TODO Auto-generated method stub

		//객테 생성 후 x=1; y=2 값 넣어보기
		
		Point point = new Point(1,2);
//		point.setXY(1, 2);
		point.showPoint();
		
		ColorPoint cPoint = new ColorPoint(3, 4, green);
//		cPoint.setXY(3, 4);
//		cPoint.setColor("green");
		cPoint.showColorPoint();
		
		
		
		
		
		
		  
		
	}

}  
