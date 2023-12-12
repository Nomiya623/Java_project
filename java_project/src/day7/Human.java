package day7;

public class Human {
	static int money;//회비, private 제거
	private String name;
	private int age;
	//누구나 다 호출 가능한 Static method;
	
	Human(String name){
		this.name = name;
	}
	
	
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}//class
