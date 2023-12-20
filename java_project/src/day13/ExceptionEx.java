package day13;

import java.util.*;

public class ExceptionEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {

			try {
				System.out.println("나눠질 숫자를 입력: ");
				int dividend = s.nextInt();

				System.out.println("나눌 숫자를 입력: ");
				int divisor = s.nextInt();
				System.out.println(dividend / divisor);
				break; // 정상적인 나누기 완료 후 while 벗어나기


			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없음");
			} catch(InputMismatchException e) {
				System.out.println("정상적인 숫자가 아닙니다.");
				s.next();//버퍼를 한번 비워주기 위한 함수;
				//입력 안할수 a\n 반복
			} finally {
				System.out.println("finally는 무조건 실행.");
				//예외가 발생하든 아니든 무조건 실행.
			}
		}
	}
}
