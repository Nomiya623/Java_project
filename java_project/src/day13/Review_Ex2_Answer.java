package day13;

import java.util.*;

public class Review_Ex2_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주제 과일 가게 프로그램 Hashmap 생성
		// 1. 추가. 2.판매 3.개수확인 4.그외 종료
		// 1)=> 과일명, 가격, 개수를 HashMap에 저장
		// ArrayList에 추가
		// 2)=> 과일명, 개수를 입력받기
		// => 입력한 개수만큼 과일의 개수 줄이기
		// => (0개 이하의 내려가지 않도록)
		// 3) 과일명 입력 받기
		// => 입력받은 과일의 수 확인
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list
			= new ArrayList<>();
		System.out.println("과일 주문 시스템");
		while(true) {
			System.out.println("(1)과일추가 (2)판매 (3)확인 (그외) 종료");
			System.out.print("메뉴를 선택해주세요 : ");
			int select = s.nextInt();
			if(select == 1) {
				HashMap<String, Object> map
					= new HashMap<String, Object>();
				System.out.print("과일명 입력 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("가격 입력 : ");
				int price = s.nextInt();
				map.put("price", price);
				
				System.out.print("개수 입력 : ");
				int cnt = s.nextInt();
				map.put("cnt", cnt);
				
				list.add(map);
				System.out.println("추가되었습니다!");
				
				
			} else if(select == 2) {
				System.out.print("구매할 과일 입력해주세요! : ");
				String name = s.next();
				System.out.print("구매할 개수를 입력해주세요! : ");
				int cnt = s.nextInt();
				
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(fruitName.equals(name)) {
						int fruitCnt = (int) list.get(i).get("cnt");
						if(fruitCnt - cnt >= 0) {
							list.get(i).put("cnt", fruitCnt - cnt);
							System.out.println("판매되었습니다!");
							System.out.println(name + "의 남은 갯수 : " + (fruitCnt-cnt) + "개");
						}
					}
				}
			} else if(select == 3) {
				System.out.print("확인할 과일 입력해주세요! : ");
				String name = s.next();
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(fruitName.equals(name)) {
						System.out.println(name + "의 남은 갯수는 : " + list.get(i).get("cnt") + "개");
					}
				}
			} else {
				System.out.println("종료되었습니다!");
				break;
			}
		}
	}
}// class
