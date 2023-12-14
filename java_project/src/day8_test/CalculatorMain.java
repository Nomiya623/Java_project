package day8_test;

import day9.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Calculator 객체 생성 후
	//오버로딩 된 메소드 3개 호출해보기	
		
		Calculator calc = new Calculator();
		int result1 = calc.multi(3,4);
		int result2 = calc.multi(3,4,5);
		double result3 = calc.multi(3.5,4.5);
	}

	
//	System.err.println("Result 1: " + result1);
//	System.out.println("Result 2: " + result2);
//	System.out.println("Result 3: " + result3);
	
}
