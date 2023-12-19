package day12;

import java.util.*;

public class Ex6_HashMap {


	public static int score(String sub, int max) {
		System.out.println(sub + "과목의 점수를 입력해주세요: ");
		Scanner s = new Scanner(System.in);
		int input;
		
		while(true) {
		input = s.nextInt();
		if (input< 0 || input > max) {
			System.out.println(sub + "는 0~" + max + "사이의 값");
		} else {
//			return input;
			break;
		}	
		
	}
		return input;		
		
		
		
		
		
		

}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		// 성적을 입력받기
		// 이름, 자바점수, 오라클 점수, html 점수

		HashMap<String, Object> map = new HashMap<>();
		System.out.println("이름을 입력해주세요: ");
		
		map.put("name", s.next());
		int java = score ("java", 50);
		map.put("java", java);
		map.put("oracle", score("oracle", 30));
		map.put("html", score("html", 20));
		 
		
		
		
		
//		map.put("name", s.next());
//
//		System.out.println("자바점수를 입력해주새요: ");
//		int java = s.nextInt();
//		if (java < 0 || java > 100) {
//			System.out.println("0~100 사이 접수입력해주세요: ");
//		} else {
//			map.put("java", java);
//		}
//
//		System.out.println("오라클 점수 입력주세요: ");
//		int oracle = s.nextInt();
//		if (oracle < 0 || oracle > 100) {
//			System.out.println("0~100 사이 접수입력해주세요: ");
//		} else {
//			map.put("oracle", oracle);
//		}
//
//		System.out.println("html를 입력주세요: ");
//		int html = s.nextInt();
//		if (html < 0 || html > 100) {
//			System.out.println("0~100 사이 접수입력해주세요: ");
//		} else {
//			map.put("html", html);
//		}
//
//		list.add(map);
//		System.out.println("저장되었습니다.");

	}
}
