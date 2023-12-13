package day8_test;

//Parent class
public class Fruit {

	private String kind;
	private String color;
	private int price;

	Fruit() {
	}

// Constructor
	// 3개의 매개변수 파라미터 생성
	public Fruit(String kind, String color, int price) {
		this.kind = kind;
		this.color = color;
		this.price = price;
	}

	// Getter method for price
	public void getPrice() {
	}

	// Method to print price information
	void printPrice() {
		System.out.println(kind + "는 " + price + "원 입니다.");

	}

}
