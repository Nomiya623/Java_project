package day2;
//ctrl+shift+alt+O
import java.util.Scanner;

public class Ex3_if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가져올 코드는 명시: import java.util.Scanner;
		
		// 조건문2(Scanner 입력받아 처리하기)
		Scanner s = new Scanner(System.in);
				System.out.print("숫자를 입력해주세요 : ");
				int num1 = s.nextInt();
				
				// 조건문
				// 사용자가 입력한 숫자가 홀수면 '홀수 입니다.'
				// 짝수면 '짝수 입니다.' 출력
//				if(num1 % 2 == 0) {
//					System.out.println("짝수다");
//				} else {
//					System.out.println("홀수다");
//				}
				
				// 사용자가 입력한 값이 3의 배수이면
				// "3의 배수 입니다."
				// 아닐 경우 "3의 배수가 아닙니다."
				if(num1 % 3 == 0) {
					System.out.println("3의 배수다");
				} else {
					System.out.println("3의 배수가 아니다");}
		}
}