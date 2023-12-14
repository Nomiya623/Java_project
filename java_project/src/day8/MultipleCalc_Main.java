package day8;

public class MultipleCalc_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Example of using the MultipleCalc class
		MultipleCalc calculator = new MultipleCalc();

		// Multiply two numbers
		int result1 = calculator.multiply(5, 7);
		System.out.println("Multiply the 2 numbers: " + result1);

		// Multiply three numbers
		int result2 = calculator.multiply(2, 4, 6);
		System.out.println("Multiply the 3 numbers: " + result2);

		// Example of using the overloaded method with doubles
		double result3 = calculator.multiply(2.5, 1.5, 3.0);
		System.out.println("Multiply the 3 doubles: " + result3);

	}

}  
