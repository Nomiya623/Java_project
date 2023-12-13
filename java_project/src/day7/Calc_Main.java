package day7;

public class Calc_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Calculator.getSum(1,2);
		System.out.println(num);
		
		System.out.println(Calculator.getSum(1,2,3));
		
		Calculator.getSum(1.5,2.3);
		
		Calculator.circleArea(3);
		
		
		int age = 20;
		String info = "나이는 " + age + "입니다.";
		System.out.println(info);
		
		
		//name.equals(name2) =====
		//System.out.println(name.equals(name2));
		
		
	}

}
