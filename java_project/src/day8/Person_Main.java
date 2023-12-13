package day8;

public class Person_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 이름: 홍길동, 나이 30, 핸드폰번호 123-123 값을 가지는 객체 생성
	Person person = new Person("홍길동", 30);
	
	
	person.setPhone("123-123");
		
	System.out.println("Name: " + person.getName());
	System.out.println("Age: " + person.getAge());
	System.out.println("Phone: " + person.getPhone());
	
	
	
	
	}

}
