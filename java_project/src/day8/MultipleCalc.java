package day8;

public class MultipleCalc {

	private String name;

	MultipleCalc() {
	}

	MultipleCalc(String name) {
		this.name = name;
	}

	// Method to multiply two integers and return the result
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	// Overloaded method to multiply three integers and return the result
	public int multiply(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	// Method to multiply three doubles and return the result
	public double multiply(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}

	// 2,3 번의 메소드 이름을 동일하게 할것

	void nameEquals(MultipleCalc obj) {
		if (this.equals(obj.name)) {
			System.out.println();
		}
	}

	// 2,3 번의 메소드 이름으로 접근할수 있도록 선언

	// 메인함수에서 클래스 이름으로 메소드에 직접 접근 하여 호출해보기

}
