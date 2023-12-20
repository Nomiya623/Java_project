package TestSample;

import java.util.*;

//참고 : 공백으로 구분해서 값을 입력받는거는 스캐너 함수를 두개 연속으로 작성하면 됩니다
//ex) String name = scanner.next();
//double score = scanner.nextDouble();
//이렇게 작성하고 입력으로 '홍길동 4.0' 을 입력하면 
//name에는 홍길동, score에는 4.0이 들어갑니다. (공백을 넣지 않으면 구분되지 않으니 주의)
//1. 이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고, 장학생 선발 기준을 입력받아 장학생 명단을 출력하라.
class Scholarship {
	private String title;
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Double> scoreMap = new HashMap<String, Double>();

	public Scholarship(String name) {
		this.title = name;
	}

	public void read() {
		System.out.println(title + "관리시스템입니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			scoreMap.put(name, score);
		}
	}

	public void select() {
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double cutline = scanner.nextDouble();

		System.out.print("장학생 명단 : ");
		Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();
		while (it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if (score > cutline)
				System.out.print(name + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scholarship sship = new Scholarship("미래장학금");
		sship.read();
		sship.select();
	}
}
