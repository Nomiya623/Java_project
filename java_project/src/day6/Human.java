package day6;

public class Human {
	String name;
	int age;
	String phone;
	String bloodType;
	//1. 메소드를 생성
			//1-1.리턴 x, 이름: numAdd, parameter 정수형 1개 받기
			//1-2. newYear, parameter Human 타입
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void numAdd(int x) {
		x++;
	}
	
	void newYear(Human human) {
		//human == qwer1234;
		//human.age ==qwer1234.age;
		human.age++;
		//qwer1234++;
		//qwer1234.age == 31;
	}
	
	
}//class
