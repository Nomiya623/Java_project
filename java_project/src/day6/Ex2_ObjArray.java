package day6;

public class Ex2_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = new int[5];
		String strArr[] = new String [5];
		Person personArr[] = new Person[5];
		//pa ; parameter
		
//		Person p = new Person();
//		Person kim = new Person ("김철수");
//		Person hong = new Person ("홍길동", 20);
		
		
		strArr[0] = new String("Hello.");
		//strArr[0] = "Hello";
		personArr[0] = new Person("홍길동");
		
		for (int i=0; i<personArr.length; i++) {
			personArr[0] = new Person();
		}
		personArr[0].name = "홍길동";
		
		//""와 null 값이 다르다.
		System.out.println(personArr[0].name);
		
		
	} //main

} //class
