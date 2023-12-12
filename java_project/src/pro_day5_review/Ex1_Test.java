package pro_day5_review;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 크기가 5인 int형 배열을 선언하고 
//		사용자로부터 숫자를 입력받아서 5개의 값 넣기
		
//		단, 0이하의 수를 입력하면 넣지 말고 다시 입력 받을 것 
//			=> 해당 조건이 어려우면 일단 5개 
//		정상적으로 입력했다고 가정하고 진행하세요
		Scanner s = new Scanner(System.in);
		int array[] = new int[5];
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = s.nextInt();
			if(input <= 0) {
				// 0이하의 숫자 입력 시
				System.out.println("1이상의 숫자 입력하셔");
				i--; // 다시 입력하도록
			} else {
				// 1이상의 숫자 입력 시
				array[i] = input;
			}
		}
		System.out.println(Arrays.toString(array));
		
		// 합 구하기
		// array = {3, 5, 6, 8, 1}
		int oddSum = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] % 2 != 0) {
				oddSum += array[i];
			}
		}
		System.out.println("홀수들의 합 : " + oddSum);
		
		// 8. 6번에서 정의한 배열에서 가장 큰 수와 가장 작은 수의 차이 구하기
		int max = array[0];
		int min = array[0];
		
		for(int i=1; i<array.length; i++) {
			max = Math.max(array[i], max);
			
//			max = (array[i] > max) ? array[i] : max;
//			if(array[i] > max) {
//				max = array[i];
//			}
			
			min = Math.min(array[i], min);
//			min = (array[i] < min) ? array[i] : min;
//			if(array[i] < min) {
//				min = array[i];
//			}
			
		}
//		System.out.println(max - min);
		// Math.max(), min()
		
		
		
		
		
		
		
		
	}
}
