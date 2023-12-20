package day13;

import java.util.*;

public class ExceptionReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// name, age 변수를 선언하고, 스캔너 클래스 이용하여 입력받기
		// 스캐너 입력 시 타입에 맞지 않은 값 입력할 경우 예외처리 ("잘못 입력됐습니다")
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("나이를 입력해수제요");
				int age = s.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("정상적인 숫자가 아닙니다.");
				s.next();
			} catch (Exception e) {
				System.out.println("다시 입력해주세요. ");
				s.next();
			} finally {
				System.out.println("실행");
			}

		}

	}

}
