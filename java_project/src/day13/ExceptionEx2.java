package day13;

import java.util.*;

public class ExceptionEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("나눠질 숫자를 입력: ");
			int dividend = s.nextInt();

			System.out.println("나눌 숫자를 입력: ");
			int divisor = s.nextInt();

			try {
				System.out.println(dividend / divisor);
				break; // 정상적인 나누기 완료 후 while 벗어나기


			} catch (Exception e) {
				System.out.println("예기치 못한 문제가 발생했습니다.");
				System.out.println(e.getMessage());
			} 
		}
	}
}
