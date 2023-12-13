package day8_test;

public class Banana extends Fruit {
	Banana(String kind, String color, int price) {
		super(kind, color, price);
	}
	public void putInBox() {
        System.out.println("바나나 상자에 담았다.");
	}
}
