package day6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1_Array_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		//1. 정수 5개를 담을 수 있는 배열 생성
		int arr[] =  new int[5];
		
		//2.배열에 순서대로 1,2,3,4,5 넣기
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =  i+1;
			System.out.println(arr);
		}
		
		
		//3. 5개의 숫자를 입력 받아서 배열에 순서대로 넣기
		
		System.out.println("5개의 숙자를 입력하세요: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		//4. 배열내 값의 총합 구하기
		int sum = 0;
		for (int v : arr ) {
			sum += v;
		}
//		System.out.println(sum);
		
		//5. 구구단 출력하기
		for(int a = 2; a<=9; a++) {
			System.out.println("=====" + a + "단====");
			for (int b = 2; b<=9; b++) {
				System.out.println(a + "*" + b + "=" + (a*b));
			}
		}
		
		//6. [1,4,3,5,2] 배열 선언 후 배열 내 숫자만큼 별표 찍기
		int arr2[] =  {1,4,3,5,2};
		
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i]; j++)
			System.out.println("*");
		}
		System.out.println("\n");
		
		//System.out.println;와 동일 System.out.println("\n"); 특수 기능이 있는 키워드로 인식, 줄바꿈.
		//종종 텍스트안에서 다음 줄에 적고 싶을 때 
		System.out.println("안녕하세요. \n반갑습니다.");
		System.out.println("안녕하세요. \t반갑습니다."); //탭 크기 만큼 뛰어준다.
		System.out.println("\" 안녕하세요. \"");
		System.out.println("' 안녕하세요. '");
		System.out.println("\\test"); //\t 출력을 원할 경우 \\t 입력;
		
	}///main

}//class
