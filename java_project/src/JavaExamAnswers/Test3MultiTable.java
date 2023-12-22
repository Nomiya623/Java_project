package JavaExamAnswers;

import java.util.*;

public class Test3MultiTable {
	public static void main(String[] args) {
//	[문항3]  3. 숫자를 1개 입력받고 해당 숫자의 구구단을 출력하시오.

//	조건1) 입력받은 숫자는 2부터 9사이의 값이어야 하며 이외의 값이 입력될 경우 재입력하도록 함
//	조건2) -1을 입력할 경우에는 '종료되었습니다' 문구 출력 후 종료
//	조건3) -1을 입력하기 전까지는 코드는 계속 진행되어야 함

		Scanner s = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하세요: ");

		while (true) {
			int input = getInput(s);

//		조건3) -1을 입력하기 전까지는 코드는 계속 진행되어야 함
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

//		조건1)입력받은 숫자는 2부터 9사이의 값이어야 하며 이외의 값이 입력될 경우 재입력하도록 함
			if (input < 2 && input >= 9) {
				printMultipleTable(input);
			} else {
				System.out.println("2부터 9사이 숫자를 입력하세요. ");

			}

		}

	}

	private static int getInput(Scanner s) {
		// TODO Auto-generated method stub
		int input;
		while (true) {
			try {
				System.out.println("숫자를 입력하세요(2부터 9사이): ");
				input = Integer.parseInt(s.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("2부터 9사이 숫자만 입력하세요: ");
			}
		}

		return input;
	}

//main 구구단 메소드 출력
	private static void printMultipleTable(int input) {
		// TODO Auto-generated method stub
		System.out.println("=====" + input + "단=====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + "*" + i + "=" + (input * i));
		}

	}
}
