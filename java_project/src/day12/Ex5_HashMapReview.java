package day12;

import java.util.*;

public class Ex5_HashMapReview {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.println("== (1)입력  (2) 검색 (3) 종료==");
			System.out.println("메뉴를 선택하세요: ");
			int choice = s.nextInt();
			if (choice == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				System.out.println("이름을 입력해주세요: ");
				map.put("name", s.next());
				System.out.println("이름을 입력주세요: ");
				map.put("age", s.next());
				System.out.println("나이를 입력주세요: ");
				map.put("addr", s.next());
				System.out.println("주소를 입력주세요: ");
				map.put("phone", s.next());
				System.out.println("핸드폰번호를 입력주세요: ");
				list.add(map);
				System.out.println("저장되었습니다.");

			} else if (choice == 2) {
				System.out.println("검색할 이름을 입력하세요:");
				String keyword = s.next();
				boolean flg = false;

				for (int i = 0; i < list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if (name.equals(keyword)) {
						System.out.println("이름: " + name);
						System.out.println("나이: " + list.get(i).get("name"));
						System.out.println("주소: " + list.get(i).get("addr"));
						System.out.println("핸드폰번호: " + list.get(i).get("핸드폰번호"));
						flg = true;
						break;
					}
				}

				if (!flg) {
					System.out.println("찾는 사람이 없습니다.");
				} else if (choice == 3) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("1, 2, 3 중에 하나를 입력해주세요.");
				}
			}
		}

	}
}
