package TestSample2;

import java.util.*;

public class RandomMultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int totalScore = 0;

		for (int i = 0; i < 5; i++) {
			int num1 = r.nextInt(9) + 1;
			int num2 = r.nextInt(9) + 1;

			int correctAnswer = num1 * num2;

			System.out.println("[" + num1 + "*" + num2 + "= ?");

			System.out.println("정갑을 입력하세요: ");
			int userAnswer = s.nextInt();

			if (userAnswer == correctAnswer) {
				System.out.println("정답입니다. ");
				totalScore += 20;

			} else {
				System.out.println("오답입니다. 정답은 :  " + correctAnswer);
			}

		}

		
		System.out.println("[총 " + totalScore + "접입니다.]");
		
		s.close();
		
	}

}
