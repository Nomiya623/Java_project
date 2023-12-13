package day8;

public class MultipleCalc {
	
	private String name;



	MultipleCalc(){}
	MultipleCalc(String name){
		this.name= name;
	}
	
	// 2. 클래스 명 MultipleCalc
	// 2개의 정수를 받아 후 곱해서 리턴하는 메소드 생성
	
	static int getSum(int a, int b) {
		int sum;
		sum = a*b;
		return sum;
	}
	
	// 3개의 정수를 받아 후 곱해서 리턴하는 메소드 생성
	static int getSum(int a, int b, int c) {
		int sum;
		sum = a*b*c;
		return sum;
	}
	
	

	//2,3 번의 메소드 이름을 동일하게 할것
	
	void nameEquals (MultipleCalc obj) {
		if(this.nameEquals(obj.getName)) {
			System.out.println();
		}
	}
	
	//2,3 번의 메소드 이름으로 접근할수 있도록 선언
	
	
	
	
	// 메인함수에서 클래스 이름으로 메소드에 직접 접근 하여 호출해보기
	
	
	
	
}
