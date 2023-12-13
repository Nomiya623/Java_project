package day8;

public class Person {
	// 1. 아래 조건에 맞는 클래스 생성
	// 변수: name(이름), age(나이), phone (휴대폰번호)

	static private String name;
	private int age;
	private int phone;

	// 객체를 생성하여 이름, 나이를 초기화

	Person(String name) {
		this.name = name;
	}

	Person() {
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	// 매개변수를 phone값을 입력받아 저장히는 메소드 생성

	void getPhone(int phone) {
		this.phone = phone;
		System.out.println();
	}

	// 이름: 홍길동, 나이 30, 핸드폰번호 123-123 값을 가지는 객체 생성

	void info() {
		System.out.println("이름: " + name + "나이 " + age + "핸드폰번호 ");
	}

}
