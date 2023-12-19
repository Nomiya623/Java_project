package day9_test;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
//		다음과 같은 Dictionary 클래스가 있다. 실행 결과와 같이 작동하도록 
//		Dictionary 클래스의 kor2Eng() 메소드와 DicApp 클래스를 작성하라.
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어?");
            String input = scanner.next();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String result = Dictionary.kor2Eng(input);
            System.out.println(input + "은(는) " + result);
        }

        scanner.close();
    }
		
		
	}
