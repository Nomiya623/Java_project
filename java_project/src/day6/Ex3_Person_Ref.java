package day6;

public class Ex3_Person_Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 메소드를 생성
		// 1-1.리턴 x, 이름: numAdd, parameter 정수형 1개 받기
		// 1-2. newYear, parameter Human 타입
		Human hong = new Human("홍길동", 30);

		Human kim = new Human("김철수", 20);

		int num = 10;
		// int b = a;
		hong.numAdd(num);
		System.out.println(num++);
		// hong 주소:qwer1234
		// hong.age == qwer1234;
		hong.newYear(hong);
		System.out.println(num);
		// hong.age == qwer1234.age;
		// hong.age == qwer1234 == 31;

		kim.numAdd(num);
		System.out.println(num);

		kim.newYear(kim);
		System.out.println(num);

	}// main

}// class
