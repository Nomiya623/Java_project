package day2;

public class BooleanAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//출력
//		System.out.println(1+1);
//		//문자열이 포함된 덧셈은 이어서 붙임
//		System.out.println("1"+"1");
		
		int age = 20;
		System.out.println("홍길동의 나이는 " + age + " 입니다.");
		System.out.println(age);
		
		System.out.println("1"+ (1 + 1));
		
		int a = 10;
		double b = 20.5;
		//boolean c = a > b; //true or false
		System.out.println(a > 10 && b > 20); //false
		System.out.println(a > 10 || b > 20); //true
		a++;
		System.out.println(a > 10 && b > 20); //true
		
		//중감연산자 봇급
		int num1 = 10;
		int num2 = 3;
		
		num2 = num1++;
		num2 = ++num1;
		System.out.println(num2);
		System.out.println(num1);
	}

}
