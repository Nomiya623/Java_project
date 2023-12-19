package day12;
//HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 
//관리 프로그램을 작성하세요. 
//아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 
//6번을 입력받으면 프로그램 종료. 
/*
	** 자바 성적 관리 프로그램 **
	1. 전체 조회 
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료
*/

import java.util.*;

public class Test04Ex {
	HashMap<String, Integer> data = new HashMap<String, Integer>();
	Scanner s = new Scanner(System.in);
	
	void printAll() {
		Set<String> keys = data.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = data.get(name);
			System.out.println(name + ": " +score );
		}
		System.out.println("=========================");
		}
	void addData(Scanner sc) {
		System.out.println("이름>> ");
		String name = sc.nextLine();
		
	}
	
	
	
	
	
	
	
	
	
}
