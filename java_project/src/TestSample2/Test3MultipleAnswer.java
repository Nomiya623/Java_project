package TestSample2;

import java.util.*;

public class Test3MultipleAnswer {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            int input = getInput(scanner);

	            // 조건 3: -1이 입력되기 전까지 계속 진행
	            if (input == -1) {
	                System.out.println("종료되었습니다.");
	                break;
	            }

	            // 조건 1: 입력받은 숫자는 2부터 9사이의 값이어야 함
	            if (input >= 2 && input <= 9) {
	                printMultiplicationTable(input);
	            } else {
	                System.out.println("2부터 9사이의 숫자를 입력하세요.");
	            }
	        }
	    }

	    // 숫자 입력 및 예외처리 메소드
	    private static int getInput(Scanner scanner) {
	        int input;
	        while (true) {
	            try {
	                System.out.print("숫자를 입력하세요 (2부터 9 또는 -1 종료): ");
	                input = Integer.parseInt(scanner.nextLine());
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("올바른 숫자를 입력하세요.");
	            }
	        }
	        return input;
	    }

	    // 구구단 출력 메소드
	    private static void printMultiplicationTable(int num) {
	        System.out.println(num + "단 출력:");
	        for (int i = 1; i <= 9; i++) {
	            System.out.println(num + " * " + i + " = " + (num * i));
	        }
	    }
	}

