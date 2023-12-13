package day6;

public class Person {
	String name;
	int age;
	String addr;

	// Person 생성자(method)를 직접 생성
	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	Person(String name) {
		this.name = name;
	}

	Person() {

	}

	String getName() {
		return name;
	}
	// 클래스 명과 이름 값을 뒤돌려줌.

	// 1. person 클래스에서 getage 메소드 만들기
	// >리턴은 age 에 있는 변수 값
	int getAge() {
		return age;
	}

	// 2. Person을 통해서 객체 생성
	// 객체명: lee, 생성자 name을 "이영희"로 초기화
	// age 값 25;
	//

	// 3. 이름이 info 메소드 호출하기
	// 뒤돌리기 void 값 넣어주기
	void info() {
		System.out.println("이믈은 " + name + ", 나이는" + age + "입니다.");
	}

	void setAddr(String addr) {
		this.addr = addr;
		// 대부분 변수 코딩 법
		System.out.println();
	}

	// 4.Person 생성자를 수정
	// >이름과 나이를 받아서 초기화하도록 설정.

	// 5.Person 클래스에서 setAddr 메소드 생성
	// 파리미터로 문자열 받도록 선언
	// 객체에서 setAddr 호출하면서 문자열 보내면 해당 메소드에서 setAddr 변수에 넣기

}// class
