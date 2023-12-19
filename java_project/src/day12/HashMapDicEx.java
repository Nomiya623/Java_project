package day12;

import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// 3 개의 (key, value) 쌍을 map.put(map) 에 저장; 시험 점수 관리
		map.put("홍길동", 80);
		map.put("이동재", 100);
		map.put("박승영", 90);
		map.put("유재석", 95);
		map.put("강호동", 70);

		// 문자열 이름 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
//		Scanner s = new Scanner(System.in);
//		while (true) {
//			System.out.println("이름을 입력해주세요: ");
//			String name = s.next();
//			if (name.equals("exit")) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//
//			if (map.containsKey(name)) {
//				int score = map.get(name);
//				System.out.println(name + "님의 점수는 " + score + "점 입니다.");
//			} else {
//				System.out.println("없는 이름입니다.");
//			}
//
//		}

		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			System.out.println(name + "님의 점수는 " + score + "점 입니다.");
			
			
			
		}
		
		
		
		
		
	}
}
