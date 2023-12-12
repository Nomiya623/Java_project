package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		// 6. 기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
		//단, 0이하의 수를 입력하면 넣지 말고 다시 입력 받을 것 
		//=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
		int array[] = new int[5];
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력: ");
			int input = s.nextInt();
			if(input <= 0) {
				System.out.println("1이상 숫자를 입력하세요.");
				i--; //다시 입력받도록
			} else {
				array[i] = input;
			}
		} 
		//자주사용하는 함수.
		System.out.println(Arrays.toString(array));
		
		//7.6번에서 정의한 배열에서 홀수들의 합 구하기
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i] % 2!= 0) {
				sum+=array[i];
			}
		}
		System.out.println("홀수들의 합: " + sum);
		
		//8. 6번에서 정의한 배열에서 가장 큰 수와 가장 작은 수의 차이 구하기
		int max = array[0];
		int min = array[0];
			for (int i=0; i<array.length; i++) {
				//max = Math.max(array[i], max);
				//min = Math.min(array[i], min);

				max = (array[i] > max) ? array[i]:max ;
				//if(array[i]>max) {
					//max = array[i]
				//}
				
				min = (array[i] < min) ? array[i]:min ;
				//if(array[i]>max) {
				//max = array[i]
				//}
			}
		System.out.println(Math.abs(max-min));
		
		int oddSum = 0;
		int evenSum = 0;
		for (int i=0; i<array.length; i++) {
		// for-each 
			if (array[i] % 2== 0) {
				evenSum+=array[i];
			} else {
				oddSum+=array[i];
			}
		}
			System.out.println(Math.abs(evenSum-oddSum));
		
		//개발자 국룰
			int phoneNumberTest = 10;
			final int PHONE_NUMBER_TEST = 10;
		
		// for 값 더 생략해서 적기 -  for-each
			int sum1 = 0;
			for(int v : array) {
				sum+=v;
			System.out.println(v);
		}
			
		s.close();
		//버블정렬 개념. 이론 학습 필요.	
	}//main

}//class
