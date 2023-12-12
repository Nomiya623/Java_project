package day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex7_Sort_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		//1. 정수를 담은 크기가 6인 배열 생성
		// 배열은 arr
		
		int arr[] = new int [6];
		
		//2. 랜덤한 숫자 6개 넣기;
		//랜덤한 범위가 1~30;
		for (int i=0; i<arr.length;i++) {
			arr[i] = ran.nextInt(30)+1;
		}
			System.out.println("random number sort: " + Arrays.toString(arr));
			
		//3. 배열 내의 있는 값들의 총 합 
		//총합: "00";
			
			int sum = 0;
			for(int v : arr) {
				sum+= v;
			}
			System.out.println("total: " + sum);
			
		//4. 위 배열에서 15이상의 숫자들만 따로 빼서
			//새로운 배열을 만들기
			//배열명은 arr2
			
			int arr2 [] = new int [6];
			int idx = 0;
			for (int i=0; i<arr.length;i++) {
				if (arr[i] >= 15) {
					//cnt++; //arr2[cnt++] = arr[i];
					arr2[idx++] =arr[i];
			}
				System.out.println(Arrays.toString(arr2));
		}
		//5.arr배열에서 짝수들을 음수로 바꾸기
			
			for (int i =0; i<arr.length;i++)
					if(arr[i]% 2==0) {
						arr[i] = -arr[i];
					}
				System.out.println(arr);
				
		//6. arr배열애서 홀수들의 합고 양수들의 합의 차이 구하기
			//결과 모주건 양수로
			int oddSum=0;	
			int evenSum=0;
			for(int v : arr) {
				if (v % 2 ==0) {
					evenSum+=v;
				} else {
					oddSum+=v;
				}
			}	
			System.out.println(oddSum-evenSum);	
			//System.out.println(evenSum-oddSum);	
			
			
		//7. arr배열에서 큰값 구하고
			int max = arr[0];
			for(int i=0; i<arr.length; i++) {
				//if(arr[i] > arr[i+1] ) {
				if(max < arr[i] ) {
					max = arr[i];
					
				}
			}
			int temp = arr[0];
			arr[0] = max;
			max = temp;
			
		//8. arr배열에서 가장 큰 수의 위치 idx 값 찾기
			int index = 0;;
			for(int i=0; i<arr.length; i++) {
				if (arr[i] > arr[index]) {
					index = i;
				}
			} 
			
		//8-1.가장 큰 값의 큰 위치랑 변경
			
			int temp1 = arr[0];
			arr[0] = arr[index];
			arr[index] = temp;
			
			
	}//main
		
}//class
