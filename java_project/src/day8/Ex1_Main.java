package day8;

import java.util.Arrays;

import day7.Human;

public class Ex1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 5, 10, 30, 5, 10, 25 };
		
		Ex1_ObjMethod obj = new Ex1_ObjMethod();
		int sum = obj.sumArray(arr);
		
		System.out.println("배열의 종합: " + sum);
		
		
		Ex1_ObjMethod hong1 = new Ex1_ObjMethod("홍길동");
		Ex1_ObjMethod hong2 = new Ex1_ObjMethod("홍길동");
		Human hong3 = new Human("홍길동");
		
		
		//객체를 비교하는 메소드
		//두 객체가 가지고 있는 name 같다면
		//'같은 사람이다'  라는 메세지 출력
		//조건1. 매게변수를 객체를 넘겨서 비교하기
		
		
		hong1.nameEquals(hong2);
		
		
		
		
		
		
	}

}
