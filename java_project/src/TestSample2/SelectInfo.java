package TestSample2;

import java.util.*;

public class SelectInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		// 회원정보관리
		while (true) {
			System.out.println("== (1)입력 (2) 삭제 (3) 출력 (그외)종료 ==");
			System.out.println("숫자 입력: ");
			int select = s.nextInt();
			if (select == 1) {
				// 데이터 입력
				HashMap<String, Object> map = new HashMap<>();
				System.out.println("이름 입력: ");
				String name = s.next();
				map.put("name", name);
				System.out.println("나이 입력: ");
				int age = s.nextInt();
				map.put("age", age);
				System.out.println("주소 입력: ");
				String addr = s.next();
				map.put("addr", addr);

				list.add(map);
				System.out.println("저장되었습니다.");

			} else if (select == 2) {
				// 데이터 삭제
				System.out.println("삭제할 값 입력: ");
				String input = s.next();
				for (int i = 0; i < list.size(); i++) {
					String name = (String) list.get(i).get(input);
					if (input.equals(name)) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
						break;
					}
				}
			} else if (select == 3) {
				// 데이터 출력
				// 이름을 입력받아서 리스트에서 이름이 같은 사람
				// 찾은 후 정보 출력
				System.out.println("출력 부분: ");
				String input = s.next();
				for (int i = 0; i < list.size(); i++) {
					String name = (String) list.get(i).get("name");
					System.out.println(list.get(i).get("name"));
					if (input.equals(name)) {
						System.out.println("이름 : " + name);
						System.out.println("나이 : " + list.get(i).get("age"));
						System.out.println("주소 : " + list.get(i).get("addr"));
					}
				}

			} else {
				System.out.println("종류되었습니다.");
				break;
			}
		}

	}
}
