package day11;

import java.util.Random;
import java.util.Scanner;

public class RandomMultiplicationQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		Random random = new Random();
		
		int totalScore = 0;
		
		for(int i= 0; i < 5; i++) {
			//랜덤한 두수 생성
			int num1 = random.nextInt(9)+1;
			int num2 = random.nextInt(9)+1;
			
			
			
			//정답 계산
			int correctAnswer = num1* num2;
			
			//문제 출력
			System.out.println("[" + num1 + "*" + num2 +"= ? ]");
			
			
			//사용자에게 입력 받기
			System.out.println("정답을 입력하세요: ");
			int userAnswer = scanner.nextInt();
			
			//정답인지 오답인지 확인, 점수 계산
			if(userAnswer == correctAnswer) {
				System.out.println("정답입니다. ");
				totalScore+=20;
			} else {
				System.out.println("오답니다. 정답은: " + correctAnswer + "입니다.");
			}
			
		}
		
		
		// 최종 점수 출력
        System.out.println("[ 총 " + totalScore + "점입니다. ]");

        scanner.close();	
		
		
		
	}

}
