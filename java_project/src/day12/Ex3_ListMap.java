package day12;

import java.util.*;

public class Ex3_ListMap {
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("name", "이동재");
		map.put("java", 90);
		map.put("oracle", 95);
		map.put("html", 100);

		list.add(map);
		map.clear();

		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "홍길동");
		map2.put("java", 90);
		map2.put("oracle", 95);
		map2.put("html", 100);

		list.add(map2);
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			System.out.println("이름:" + user.get("name"));
			System.out.println("자바 점수: " + user.get("java"));
			System.out.println("oracle 점수: " + user.get("oracle"));
			System.out.println("=============");
		}

	}
}
