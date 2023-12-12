package day7;

public class Ex2_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Sample ob1 = new Sample(3);
			Sample ob2 = new Sample(4);
			Sample s;
			
			s=ob2;
			ob1 = ob2; //객체 지환
			System.out.println(ob1.id);
			System.out.println(ob2.id);
			
		}//class
		
	}//main

