package day13;

import java.util.*;

public class Review {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		//회원정보관리
		while(true) {
			System.out.println("== (1)입력 (2) 삭제 (3) 출력 (그외)종료 ==");
			System.out.println("숫자 입력: ");
			int select = s.nextInt();
			if(select == 1) {
				//데이터 입력
				HashMap<String, Object> map = new HashMap<>();
				System.out.println("이름 입력: ");
				String name = s.next();
				map.put("name", name);
				System.out.println("나이 입력: ");
				int age = s.nextInt();
				map.put("age", 30);
				System.out.println("주소 입력: ");
				String addr = s.next();
				map.put("addr", "인천");
				
			} else if(select == 2) {
				//데이터 삭제
			} else if (select == 3) {
				//데이터 출력
			} else {
				System.out.println("종류되었습니다.");
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
