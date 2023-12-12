package day7;

public class Student {
	//1. 다음 조건에 맞게 클래스 생성
		//조건 1. 클래스명 : Student
		
		//조건 2. 변수 : stuNo(학번, int)
	 	//stuName(이름, String)
	 	//stuDept(학과, String)
	 	//age(나이, int)
	  	//gender(성별, String)
		
	int stuNo;
	String stuName;
	String stuDept; 
	int age;
	String gender;
	//클래스: field 영역 + 메소드
	
	
//	조건 3. 생성자 : 1. 학번, 이름 초기화 하는 생성자
//	  2. 학번, 이름, 학과 초기화 하는 생성자
	//this() = 생성자에서 다른 생성자에세 호출
	Student ( int stuNo, String stuName){
		this(stuNo, stuName, "");
		
	}
	
	Student (int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
		
	}
	
	
//조건 4. 메소드 : 1. setInfo
//	 (나이와 성별을 입력받아서 저장, 리턴 x)
//	  2. getAge
//	  (호출 시 객체의 나이 값 리턴)
	
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {
		return this.age;
	} 
	//필드에 있는 영역을 생략하지 않고 적기
	
//조건 5. 메인 메소드에서 해당 클래스를 이용하여 객체 생성 및 호출
//  1. 객체명 : hong, 이름 : 홍길동, 학번 : 1234
//  2. 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
//  3. hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
//  4. hong 객체에서 getAge 호출 후 해당 값 출력
	
	
	
}//class
