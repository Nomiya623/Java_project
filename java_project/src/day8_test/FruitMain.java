package day8_test;

import java.util.Scanner;

public class FruitMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
//		2. 메인클래스 생성 후 객체 메인 함수에서 2번에서 만든 클래스 객체 만들기
//		 1) 클래스명 : FruitMain
//		 2) Banana, Orange, Apple 객체 생성(값 임의로 넣기)

		// Creating objects of Banana, Orange, and Apple
		System.out.println("바나나 가격을 입력해주세요: ");
		int bananaPrice = scanner.nextInt();
		Banana banana = new Banana("바나나", "노란색", bananaPrice);
		
		System.out.println("오렌지 가격을 입력해주세요: ");
		int orangePrice = scanner.nextInt();
		Orange orange = new Orange("오렌지는", "노란색", orangePrice);
		
		System.out.println("사과 가격을 입력해주세요: ");
		int applePrice = scanner.nextInt();
		Apple apple = new Apple("사과", "빨간색", applePrice);
		
		

		// Printing price information for each fruit
		banana.printPrice();
		orange.printPrice();
		apple.printPrice();
		
		// total Sum
		int totalSum  = banana.getPrice() + orange.getPrice() + apple.getPrice();
		System.out.println("3개의 과일 가격 총합은: " + totalSum + "원입니다.");
		
		//close the Scanner
		scanner.close();
		
		
	}

}
