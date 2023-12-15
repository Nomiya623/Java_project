package day10;

public class Rect {
	int widght;
	int height;
	
	
	
	Rect(int widght, int height){
		this.widght = widght;
		this.height = height;
	}
	
	
	
	
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if(widght * height == r.widght * r.height)
			return true;
		else 
			return false;
	}
	
	String age1 = "20";
	int age2 = Integer.parseInt(age1);
	// 숫자를 숫자로 사용;
	
	
	
	
	}
	
