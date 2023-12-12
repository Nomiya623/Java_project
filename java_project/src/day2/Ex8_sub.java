package day2;

import java.util.Scanner;

public class Ex8_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var 데이터 타입 상관없이 적용 가능
//		1. 숫자를 입력받고 해당 숫자가 10보다 클 경우 '큰 수', 아닐경우
//		'작은 수'를 출력하시오. (조건문)
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = s.nextInt();
		if (num > 10) {
			System.out.println("큰 수");
			if (num<10) {
				System.out.println("작은 수");
			}
		}		
			
//		2. 숫자를 입력받고 해당 숫자가 90이상일 경우 'A 등급',
//		70점 이상일 경우 'B 등급', 50점 이상일 경우 'C 등급', 
//		그 외의 숫자일 경우 'F 등급'을 출력하시오. (조건문)
		Scanner s1 = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num1 = s1.nextInt();
		if (num1 >= 90) {
			System.out.println("A 등급");
		} else if (num1 >= 70) {
			System.out.println("B 등급");
		} else if (num1 >= 50) {
			System.out.println("C 등급");
		} else  {
			System.out.println("F 등급");
		}
		
// 	3. 2번에서 작성한 코드를 switch~case문으로 바꿔서 작성하시오.
	//(2번에서 switch를 썻다면 else if로 변경)
			switch (num1/10) {
			
			case '9':
				System.out.println("A 등급");
				break;
			case '8' :
			case '7' :
				System.out.println("B 등급");
				break;
			case '6' :
				System.out.println("C 등급");
				break;
			default :
				System.out.println("F 등급");
				break;
			}
// 4. 반복문을 통해 1부터 10까지 숫자를 차례대로 출력하시오.
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}	
//5. 반복문을 통해 1부터 100중에서 짝수만 화면에 차례대로 출력하시오.
		int sum1=0;
		int i;
		for (i=1; i<=100; i++) {
		if (i % 2==0)	
			System.out.println(i);
		}
		
//6. 반북문을 통해 1부터 100중 홀수의 합, 짝수의 합을 각각 구하시오.
		int sum2=0;
		int i1;
		for (i1=0; i1<=100; i1++) {
		if (i1 % 2==0)
		continue;
		sum2+= i1;		
		}
		System.out.println("1부터 100까지 홀수합은: "+ sum2 + "입니다!");
//7. 반북문을 통해 1 부터 100중 3의 베수 이면서 동시에 5의 배수인 숫자 출력하십시오.
		for (i1=1; i1<=100; i1++) {
			if (i1 % 3 == 0 && i1 % 5 ==0);		
		}
		System.out.println(i1);

	}//main

}//class
