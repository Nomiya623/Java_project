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
		
		//직접 해보기
		
		//4 번 메뉴 
		//과일의 가격변경
		//과일이름 입력 받은 후 해당 과일이 있는 먼저 확인
		// 과일이 잇을 경우 새로운 가격을 입력받아서 
		//3번메뉴에서 개수확린할대 가격까지 같이 확인
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("과일 주문 시스템");
		while (true) {
			System.out.println("(1)과일추가 (2)판매 (3)확인 (그외) 종료");
			System.out.print("메뉴를 선택해주세요 : ");
			int select = s.nextInt();
			if (select == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일명 입력 : ");
				String name = s.next();
				map.put("name", name);


				// 2.중복된 과일명을 입력 시 (ex, 오랜지가 있는데 1번 메뉴에서 오렌지 다시 입력 시
				// 이때는 가겨을 입력 받지 말고
				// "몇개를 추가하시겠습니까" 물어보고 개수 추가하기
				// for, if 문 사용하여 자바 코드 작성
				Boolean isFruit = false; // 있는 과일인지 확인
				for (int i = 0; i < list.size(); i++) {
					System.out.println();
					String Fruit = (String) list.get(i).get(name);
					if (name.equals(Fruit)) {
						isFruit = !isFruit;// true
						System.out.println("추가할 개수 입력: ");
						int count = s.nextInt();
						int fruitCnt = (int) list.get(i).get("cnt");
						list.get(i).put("cnt", count + fruitCnt);
						System.out.println("개 추가되었습니다!");
						break;
					}

				}

				if (!isFruit) {
					System.out.print("가격 입력 : ");
					int price = s.nextInt();
					map.put("price", price1);

					System.out.print("개수 입력 : ");
					int count = s.nextInt();
					map.put("cnt", count);
					list.add(map);
				}

			} else if (select == 2) {
				//판매
				System.out.print("구매할 과일 입력해주세요! : ");
				String name = s.next();
				
				System.out.print("구매할 개수를 입력해주세요! : ");
				int cnt = s.nextInt();

				for (int i = 0; i < list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if (fruitName.equals(name)) {
						HashMap<String, Object> map = new HashMap<>();// hashmap key value
						map = list.get(i);// map에서 분리해서 입력할 경우.
						int fruitCnt = (int) list.get(i).get("cnt");
						if (fruitCnt - cnt >= 0) {
							list.get(i).put("cnt", fruitCnt - cnt);
							System.out.println("판매되었습니다!");
							System.out.println(name + "의 남은 갯수 : " + (fruitCnt - cnt) + "개");
						} else {
							System.out.println("재고 부족.");
							System.out.println(name + "의 현재 남은 개수는 " + fruitCnt + "개 입니다." );
						}
					}
				}
			} else if (select == 3) {
				System.out.print("확인할 과일 입력해주세요! : ");
				String name = s.next();
				
				for (int i = 0; i < list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if (fruitName.equals(name)) {
						HashMap<String, Object>map = new HashMap<>();
						map = list.get(i);
						int fruitCnt = (int)map.get("cnt");
						System.out.println(name + "의 현재 남은 개수는 : " + fruitCnt + "개");
					}
				}
			 } else if (select == 4) {
	                System.out.print("가격을 변경할 과일 입력해주세요! : ");
	                String name = s.next();

	                for (int i = 0; i < list.size(); i++) {
	                    String fruitName = (String) list.get(i).get("name");
	                    if (fruitName.equals(name)) {
	                        System.out.print("새로운 가격 입력 : ");
	                        int newPrice = s.nextInt();
	                        list.get(i).put("price", newPrice);
	                        System.out.println(name + "의 가격이 변경되었습니다!");
	                    }
	                }	
				
				
			} else {
				System.out.println("종료되었습니다!");
				break;
			}
		}
		boolean flg = false;
		if (!flg) {
			System.out.println("찾는 과일이 없습니다. ");
		} else {
			System.out.println("1, 2, 3, 4 또는 종류하려면 5 메뉴 중에 하나를 선택해주세요. ");
		}

	}//main
}// class
