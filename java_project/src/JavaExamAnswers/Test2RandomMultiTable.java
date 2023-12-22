package JavaExamAnswers;

import java.util.*;

public class Test2RandomMultiTable {

//	[문항2]  2. 랜덤한 숫자를 이용하여 구구단 문제를 3문제 출력하시오.
//	(정답을 입력받을 필요 없이 문제만 출력하면 됨

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();

		for (int i = 0; i < 3; i++) {
			int num1 = r.nextInt(8) + 2;
			int num2 = r.nextInt(9) + 1;

			System.out.println("문제 " + (i + 1) + ": " + num1 + " * " + num2 + " = ?");

		}
	}
}