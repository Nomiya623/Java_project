package day7;

public class Calc_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Calculator.getSum(1, 2);
		System.out.println(num);

		System.out.println(Calculator.getSum(1, 2, 3));

		Calculator.getSum(1.5, 2.3);

		Calculator.circleArea(3);

		int age = 20;
		String info = "나이는 " + age + "입니다.";
		System.out.println(info);

		// name.equals(name2) =====
		// System.out.println(name1.equals(name2));

		Human h1 = new Human("홍길동");
		// name = hong gil dong
		h1.setAge(20);
		Human h2 = new Human("홍길동");
		int name1;
		int name2;

		System.out.println(name1.equals(name2));
		if (name1 == name2) {
			System.out.println("이름이 같다");
		}

		
		
		
		
		
	}

}
