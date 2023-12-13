package day8_test;

public class FruitMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2. 메인클래스 생성 후 객체 메인 함수에서 2번에서 만든 클래스 객체 만들기
//		 1) 클래스명 : FruitMain
//		 2) Banana, Orange, Apple 객체 생성(값 임의로 넣기)

		// Creating objects of Banana, Orange, and Apple

		Banana banana = new Banana("바나나", "노란색", 1000);
		Orange orange = new Orange("오렌지", "주황색", 1500);
		Apple apple = new Apple("사과", "빨간색", 2000);

		// Printing price information for each fruit
		banana.printPrice();
		orange.printPrice();
		apple.printPrice();

	}

}
