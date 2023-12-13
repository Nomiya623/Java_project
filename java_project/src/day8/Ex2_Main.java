package day8;

public class Ex2_Main {
	
	static void print(Human obj) {
		if (obj instanceof Student) {
			System.out.println("해당 객체는 학생입니다.");	
		} else if(obj instanceof Worker) {
			System.out.println("해당 객체는 직장인입니다.");
		} else {
			System.out.println("해당 객체는 사람입니다.");
		}
	}
	
//	static void print(Student student) {
//		System.out.println("해당 객체는 학생입니다.");
//		}
//	
//	
//	static void print(Worker worker) {
//		System.out.println("해당 객체는 직장인입니다.");
//		}
	
	
	public static void main(String[] args) {

		Human h = new Human();
		Student s = new Student();
		Worker w = new Worker();

		Human h2 = new Student();
////	Student s2 = (Student) new Human(); (X)
		Human w2 = new Worker();

		print(h);
		print(s);
		print(w);
		
		
		
		
//		int a = 10;
//		double b = 20.5;
//
//		a = (int) b;

		
//		class Person { … }
//		class Student extends Person { … }
//		...
//		Person p = new Student("이재문"); // 업캐스팅
//		...
//		Student s = (Student)p; // 다운캐스팅, (Student)의 타입 변환 표시 필요

		
		
		
		
	}
}
