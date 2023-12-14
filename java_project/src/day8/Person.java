package day8;

public class Person {
	// 1. 아래 조건에 맞는 클래스 생성
	// 변수: name(이름), age(나이), phone (휴대폰번호)

	static private String name;
	private int age;
	private String phone;

	// 객체를 생성하여 이름, 나이를 초기화

	Person(String name) {
		this.name = name;

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// 모든 변수를 private 선언, get set 메소드 구현

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 매개변수를 phone값을 입력받아 저장히는 메소드 생성

	void getPhone(String phone) {
		this.phone = phone;
	}

}
