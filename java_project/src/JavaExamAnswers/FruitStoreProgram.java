package JavaExamAnswers;

import java.util.*;

public class FruitStoreProgram {
	public static void main(String[] args) {

//	[문항5]  5. 주제 : 과일 가게 프로그램
//	* 숫자 1을 입력할 경우 '과일 추가', 2를 입력할 경우 '과일 삭제', 3을 입력할 경우 '가격 수정',
//	4를 입력할 경우 '현황 파악' 그 외의 숫자를 입력할 경우 종료 되도록 한다.
//	ex) "=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ==="
//	(복사해서 쓰셔도 됩니다.)

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("과일 주문 시스템");
		while (true) {
			System.out.println("===(1)과일추가 (2)과일판매 (3)가격수정 (4)현황파악 (그외) 종료===");
			System.out.print("메뉴를 선택해주세요 : ");
			int select = s.nextInt();
			//1.입력 부분			

			if (select == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일명 입력 : ");
				String name = s.next();
				map.put("name", name);

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
					map.put("price", price);

					System.out.print("개수 입력 : ");
					int count = s.nextInt();
					map.put("cnt", count);
					list.add(map);
				}

				// 2. 판매 부분	
			} else if (select == 2) {
				// 판매
				System.out.print("구매할 과일 입력해주세요! : ");
				String name = s.next();

				System.out.print("구매할 개수를 입력해주세요! : ");
				int cnt = s.nextInt();

				for (int i = 0; i < list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if (fruitName.equals(name)) {
						HashMap<String, Object> map = new HashMap<>();// hashmap key value
						map = list.get(i);
						int fruitCnt = (int) list.get(i).get("cnt");
						if (fruitCnt - cnt >= 0) {
							list.get(i).put("cnt", fruitCnt - cnt);
							System.out.println("판매되었습니다!");
							System.out.println(name + "의 남은 갯수 : " + (fruitCnt - cnt) + "개");
						} else {
							System.out.println("재고 부족.");
							System.out.println(name + "의 현재 남은 개수는 " + fruitCnt + "개 입니다.");
						}

					}
				}
				// 3. 가격수정
			} else if (select == 3) {
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

				// 4. 형황 파악
			} else if (select == 4) {
				System.out.print("확인할 과일 입력해주세요! : ");
				String name = s.next();

				for (int i = 0; i < list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if (fruitName.equals(name)) {
						HashMap<String, Object> map = new HashMap<>();
						map = list.get(i);
						int fruitCnt = (int) map.get("cnt");
						System.out.println(name + "의 현재 남은 개수는 : " + fruitCnt + "개");
						System.out.println(name + "의 현재 남은 개수는 " + list.get(i).get("name"));
					}
				}

				// 5.그 외 종료

			} else {
				System.out.println("종료되었습니다.");
				break;
			}

			// 찾는 과일이 없을 경우
			boolean flg = false;
			if (!flg) {
				System.out.println("찾는 과일이 없습니다. ");
			} else {
				System.out.println("1, 2, 3, 4 또는 종류하려면 5 메뉴 중에 하나를 선택해주세요. ");
			}

		}

	}// main
}// class