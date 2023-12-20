package TestSample;

import java.util.*;

//* 숫자 1을 입력할 경우 '입력 부분', 2를 입력할 경우 '삭제 부분', 3을 입력할 경우 '출력 부분'
//그 외의 값을 입력할 경우 '종료 부분'을 실행 한다.
public class MapTestEx {
//	1). 입력 부분
	public static int score(String sub, int max) {
		System.out.println(sub + "과목의 점수 입력: ");
		Scanner s = new Scanner(System.in);
		int type;

		while (true) {
			type = s.nextInt();
			if (type < 0 || type > max) {
				System.out.println(sub + "눈 0~" + max + "사이에 값");
			} else {
				break;
			}
		}
		return type;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

//	2). 삭제 부분	

		while (true) {
			System.out.println("== (1)입력 (2) 삭제 (3) 종료 ==");
			System.out.println("입력 부분: ");
			int select = s.nextInt();
			if (select == 1) {
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.println("이름을 입력해주세요: ");
				String name = s.next();
				map.put("name", name);

				System.out.println("자바 점수를 입력해주세요: ");
				map.put("java", score("java", 30));
				
				System.out.println("오라틀 점수를 입력해주세요: ");
				map.put("oracle", score("oracle", 50));
				
				
				System.out.println("html 점수를 입력해주세요: ");
				map.put("html", score("html", 20));

				list.add(map);
				System.out.println("저장되었습니다.");
				
				
//			 3). 출력 부분			 
			} else if (select == 2) {
				System.out.println("삭제 부분: ");
				String input = s.next();
				for (int i = 0; i < list.size(); i++) {
				String name = (String) list.get(i).get(input);
				if(input.equals(name)) {
					list.remove(i);
					System.out.println("삭제되었습니다.");
					break;
					}
				}
			} else if (select == 3) {
				System.out.println("출력 부분: ");
				String input = s.next();
				for (int i = 0; i < list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(input.equals(name)) {
						int sum = 
								(int) list.get(i).get("java")
								+ (int) list.get(i).get("oracle")
								+ (int) list.get(i).get("html");
						System.out.println("이름: " + name + ", 총점" + sum);
						break;
					
				}
			}
			} else {
				System.out.println("종료되었습니다.");
			}

			boolean flg = false;
			if (!flg) {
				System.out.println("찾는 사람이 없습니다.");

			} else {
				System.out.println("1, 2, 3 중에 하나를 입력해주세요.");
			}
		}
	}