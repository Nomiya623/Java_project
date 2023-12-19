package day12;

import java.util.*;

public class Ex4_ListMap {
	public static void main(String[] args) {
		// 1. String 을 관리하는 ArrayList(list) 생성
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		// 2. Key: String, Value: Object HAshMap
		HashMap<String, Object> map = new HashMap<>();

		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("addr", "인천");
		map.put("phone", "010-1234-5678");
		map.put("gender", "남자");

		list.add(map);
		// map == list.get(0);
		// map.get("name") == list.get(0).get("name";)

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "일라오");
		map2.put("age", 40);
		map2.put("addr", "협곡");
		map2.put("phone", "010-8765-4321");
		map2.put("gender", "중성");

		list.add(map2);
		// list 이름이 "홍길동"인 사람의 나이, 주소, 전화번호 검색
		// list내에서 홍길동을인 map을 먼저 찾기
		// 해당 정보 출력

		System.out.println("이름을 입력해주세요: ");
		Scanner s = new Scanner(System.in);
		String keyword = s.next();

		boolean flg = false;

		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i).get("name");
			HashMap<String, Object> member = list.get(i);
			if (name.equals(keyword)) {
				System.out.println("나이: " + list.get(i).get("name"));
				System.out.println("주소: " + member.get("addr"));
				flg = true;
				break;
			}

			if (!flg) {
				System.out.println("찾는 사람이 없습니다.");
			}

		}

	}
}
