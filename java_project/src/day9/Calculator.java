package day9;

public class Calculator {
	//1.multiple 메소드 생성;
		//1.1. int형 숫자 2개 받아서 곱한 후 리턴
		//1.2 int형 숫자 3개 받아서 곱한 후 리턴
		//1.3 double형 숫자 2개 받아서 곱한 후 리턴
		//Calculator 객체 생성 후
		//오버로딩 된 메소드 3개 호출해보기
	
	



	public Calculator(){}
	Calculator(String name){}
	
	//1.1. int형 숫자 2개 받아서 곱한 후 리턴
	public int multi(int i, int j) {
		return i * j;
	}
	
	
	//1.2 int형 숫자 3개 받아서 곱한 후 리턴

	public int multi(int i, int j, int k) {
		return i * j * k;
	}

	
	
	//1.3 double형 숫자 2개 받아서 곱한 후 리턴

	public double multi(double i, double j) {
		return i*j;
		
		
	//Calculator 객체 생성 후
	//오버로딩 된 메소드 3개 호출해보기
	}
}
