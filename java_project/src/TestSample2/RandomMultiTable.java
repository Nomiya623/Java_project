package TestSample2;

import java.util.*;

public class RandomMultiTable {

//	4. 랜덤 구구단 문제를 출력하고 정답을 입력받으시오.
//	단, 구구단은 5번 반복하며, 정답 입력 시 정답&오답 여부 및 점수를 출력해주어야 함.
//	출력 [ 9 * 7  = 63 ]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int totalScore = 0;
		int cnt = 0;
		for (int i = 0; i <= 5; i++) {
			int num1 = r.nextInt(8) + 2;
			int num2 = r.nextInt(9) + 1;

			int correctAnswer = num1 * num2;

			System.out.println("[" + num1 + "*" + num2 + "= ?");

			System.out.println("정답을 입력하세요: ");
			int userAnswer = s.nextInt();
			
			if (userAnswer == correctAnswer) {
				System.out.println("정답입니다. ");
				cnt++;
				totalScore += 20;

			} else {
				System.out.println("오답입니다. 정답은 :  " + correctAnswer);
			}

		}

		System.out.println(cnt + "개 맞췄습니다.");
		System.out.println("[총 " + totalScore + "접입니다.]");
		//System.out.println(" ");
		
		s.close();
		
	}

}

