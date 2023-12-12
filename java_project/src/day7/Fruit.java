package day7;

public class Fruit {
	private String name;
	private String color;
	private int price;

	Fruit(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	// set, get 메소드
	void setPrice(int price) {
		if (price <= 0) {
			System.out.println("올바르지 않은 값입니다.");
		} else {
			this.price = price;
		}
		this.price = price;
	}

	// 우클릭 source> Generate getters and setters> select all
	// > after get/setName> generate
	int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}// class
