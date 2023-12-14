package day9;

public class Person {
	// 1. name age 변수 선언
	// 2. 생성자 만들기
	// 2-1. 기본생성자
	// 2-2. name을 받아서 초기화 하는 생성자
	// 3. name을 받아서 리턴해주는 메소드 생성(getName)
	// 4. "동물 이름은 000 입니다" 출력해주는 주소메소드(print)
	String name;
	int age;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
