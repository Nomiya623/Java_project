package day12;

import java.util.*;

public class Ex2_List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이동재");
		list.add("박승영");
		list.add("유재석");
		list.add("강호동");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		HashMap<String, Integer> dbScore = new HashMap<>();
		dbScore.put("홍길동", 90);
		dbScore.put("이동재", 95);
		dbScore.put("박승영", 85);
		dbScore.put("강호동", 80);
		dbScore.put("유재석", 84);

		System.out.println(dbScore.get("홍길동"));

	}
}
