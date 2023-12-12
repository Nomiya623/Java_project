package day3;

import java.util.Scanner;

public class Ex4_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두개의 숫자의 큰 순 oo입니다.
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.print("첫번째 숫자를 입력 : ");
		int num2 = s.nextInt();	
		System.out.print("두번째 숫자를 입력 : ");
		if (num1 > num2) {
			System.out.println("두개의 숫자 큰 수는 " + num1 + " 입니다. ");
		} else {
			System.out.println("두개의 숫자 큰 수는 " + num2 + " 입니다. ");
		}
		
		//1. 삼항연산자
		// (num1 >= num2) 조건 참이면 num1 에 들어가고, 저짓이면 num2 들어감. 실행.
		int max2 = (num1 >= num2) ? num1 : num2;
		// max= (array[i]> max) ? array[i]: max;
		//true/false 경우 사용.
		if (num1>=num2) {
			max2 = num1;
		} else {
			max2=num2;
		}
		
		
		
		
		//2. 메소드(함수)를 이용;
		int max = Math.max(num1, num2);
		System.out.println("두개의 숫자 큰 수는 " + max + " 입니다. ");
		
	}//main
}//class
