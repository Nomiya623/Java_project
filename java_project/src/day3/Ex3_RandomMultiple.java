package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex3_RandomMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤 숫자 생성
		Random ran = new Random();//(System.in) 제외, 객체 생성;
		//int와 동일하세 변수 선언, String name = "Hong Gil dong";
		//새로 객체를 선언할때 new Random, new Scanner;
		// ran.nextInt(9) : 0~8 랜덤
		// ran.nextInt(9)+1 : 1~9 랜덤
//		String name = "홍길동";
//		String name = new String "홍길동";
		
		Scanner s = new Scanner(System.in);
		int a = ran.nextInt(8)+2;
		int b = ran.nextInt(9)+1;
		System.out.println(a +"*"+ b + "=");
		int answer = s.nextInt();
		if (answer ==a*b) {
			System.out.println("정답."); 
		 } else {
			 System.out.println("오답.");
		 }
	}//main

}//class
