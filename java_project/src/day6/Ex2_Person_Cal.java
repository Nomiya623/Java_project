package day6;

public class Ex2_Person_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바는 다중 속성을 못가짐
		//단 하나의 클래스만 상속 가능
		//====재정===: 한 클라스 내에 구현된 동알한 이름이지만 다르게 작동하는 여러 메소드;
		//====오버라이딩(overriding), 오버로딩(overloading)====;
		//1. 다양한 이름의 메소드가 동일한 개 정의되는 개
		//2. 동일한 이름의 메소드가 여러 개 정의되는 개: overloading
//		String name;//이름
//		int height;//키
//		double weight;//몸무개
//		char gender; //성별
//		boolean married; //true, false; 결혼여부
		//생성자 (constructor); 초기화 가능 클래스. 클래스에 대한 접근 권한과 이름 동일.
		//Person aPerson = new Person("Peter");
		//aPerson.age = 30;
		//String s = aPerson.getName(;)
		
		
		Person hong = new Person("홍길동", 30);
		//4개 변수, parameter
		System.out.println(hong.getName());
		//System.out.println(hong.name);
		
		// hong.age = 30;
		System.out.println(hong.age);
		
		Person kim = new Person("김철수", 20);
		System.out.println(kim.getName());
		//kim.age = 20;
		System.out.println(kim.age);
		
		Person lee = new Person("이영희", 25);
		System.out.println(lee.getName());
		//kim.age = 25;
		int age = lee.getAge();
		System.out.println(lee.getAge());
		
		lee.info();
		kim.info();
		hong.info();
		
		
		//2. Calculator
		Calculator calc = new Calculator();
		int sum = calc.getSum(2, 3);
//		System.out.println(calc.getSum(2, 3));
		System.out.println(sum);
		
		
		
		
	}//main

}//class
