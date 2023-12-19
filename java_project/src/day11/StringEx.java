package day11;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. 텍스트가 회전하여 반복하는 코드를 작성할 것
		// String buffer reverse
		// ex) test123 입력
//		test123
//		est123t
//		st123te
//		t123tes
//		123test
//		23test1
//		3test12
				

		Scanner s = new Scanner(System.in);

		System.out.println("텍스트를 입력하세요: ");
		String inputText = s.nextLine();
		
		//입력받은 텍스트 회전하여 출력
		
		for (int i = 0; i < inputText.length(); i++) {
			String rotatedText = inputText.substring(i) + inputText.substring(0, i);
			System.out.println(rotatedText);
		}

//			String first = str.substring(0,1);
//			String last = str.substring(1);
//			str result = last+first;
//			System.out.println(str);
		
	}

}
