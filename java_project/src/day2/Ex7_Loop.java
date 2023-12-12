package day2;

public class Ex7_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기회식, 조건식, 증감연감식
//		for(int i=1; i<=100; i++)  {
//		System.out.println(i);	
//		}
//		for(int i=3; i<=101; i++)  {
//			System.out.println(i);	
//			}
		//sum=sum+i
		
		int sum = 0;
		for (int i=1; i<=100; i++)  {
			sum +=i; //sum = sum + i;
			//첫 i=1; sum=0+1;
			//두 i=2; sum=1+2;
			//셋 i=3; sum=3+3;
		}
		System.out.println(sum);
		
		//for 문 1~100까지 출력
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
	
		
	//1. 숫자 20~0 순으로 출력
		for (int i=20; i>=0; i--) {
			System.out.println(i);
		}
	//2. 1부터 100중에서 3의 베수들 숫자의 합
		
		int oddSum = 0;
		int evenSum = 0;
		for (int i=1; i<=100; i++)  {
		if (i % 2 == 0 ) {
			evenSum += i;
		} else {
			oddSum += i;
		}
		}
	
		System.out.println(sum);
	//2-1. 다른방법
		
	}//main

}//class
