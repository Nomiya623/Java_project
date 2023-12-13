package day8_test;

public class Orange extends Fruit{
	Orange(String kind, String color, int price) {
		super(kind, color, price);
	}

	public void putInBox() {
        System.out.println("오랜지 상자에 담았다.");
	}
	
	
}
