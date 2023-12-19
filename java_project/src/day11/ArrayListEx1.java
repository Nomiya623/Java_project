package day11;

import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		Scanner scanner = new Scanner(System.in);
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		for (int i = 0; i < 4; i++) {
			System.out.println("이름을 입력하세요>> ");
			String s = scanner.next();
			list.add(s);
		}
		// ArrayList에 들어 있는 모든 이름 출력
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name + " ");
		}
		// 가장 긴 이름 출력
		int longestIndex = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(longestIndex).length() < list.get(i).length());
			longestIndex = i;
		}
		System.out.println("|n " + "가장 긴 이름은 : " + list.get(longestIndex));

	}
}
