package day11;

import java.util.Scanner;

public class day10_StringReview {

	public static void main(String[] args) {
		// 문자 입력방법 : 스캐너 객체의 nextInt() 대신
		// next()나 nextLine() 둘중 하나를 쓰면 됩니다.

//		1. 핸드폰 번호를 입력받고 순서대로 
//			phone1, phone2, phone3에 담기
//		ex) 010-1234-5678을 입력받으면 phone1 = 010, phone2 = 1234, phone3 = 5678
//		2. 주민등록번호를 입력받고 남자인지 여자인지 판별
//		ex) 801111-1234567
//		(뒷부분 첫 숫자가 1,3일 경우 '남자 입니다.'
//			, 아닐 경우 '여자 입니다'


		Scanner s = new Scanner(System.in);
		String phone1, phone2, phone3;
		System.out.println("핸드폰 번호를 입력하세요 (예: 010-1234-5678): ");

		String inputNum = s.next();

		String str[] = inputNum.split("-"); // 문자열 분리

		phone1 = str[0];
		phone2 = str[1];
		phone3 = str[2];

		phone1 = inputNum.substring(0, 3);
		phone2 = inputNum.substring(4, 8);
		phone1 = inputNum.substring(9, 13);

		
		
		System.out.println("주민등록번호를 입력하세요 (예: 801111-1234567): ");
		String inputRes = s.next();
		char genderStr = inputRes.charAt(7);
		String genderStr2 = inputRes.substring(7,8);
		
		if(genderStr2.equals("1") || genderStr2.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		

		
		
		
		
	}
	
}
