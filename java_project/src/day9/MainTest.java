package day9;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 이름이 "보삐"인 Animal 객체 생성
		Animal dog = new Animal("보삐");

		// 2. getName 메소드 호출
		String animalName = dog.getName();
		// System.out.println(name);

		dog.getName();
		dog.print();

		// 3. getAge 메소드 호출 후 변수에 담은 다음 풀력

		dog.age = 10;
		int age = dog.getAge();
		System.out.println(age);

		
		
		
		//book 객체 3개를 만들기
			//1.1.자바책, 홍길동 123
			//1.2.자바책, X 123
			//1.3.기본본생성자 호출
		Book javaBook  = new Book("Java", "홍길동", 123);
		Book hongBook  = new Book("hong", 321);
		Book emptyBook  = new Book();
		
	}

}
