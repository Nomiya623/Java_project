package TestSample;
import java.util.*;
//* 숫자 1을 입력할 경우 '입력 부분', 2를 입력할 경우 '삭제 부분', 3을 입력할 경우 '출력 부분'
//그 외의 값을 입력할 경우 '종료 부분'을 실행 한다.
public class MapTestEx {
//	1). 입력 부분
	public static int score(String sub, int max) {
		Scanner s = new Scanner(System.in);
		int type;
		
		while(true) {
			type = s.nextInt();
			if(type <0 || type> max) {
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
	
	while(true) {
		System.out.println("== (1)입력부분  (2) 삭제부분 (3) 종료부분 ==");
		System.out.println("숫자를 입력해주세요: ");
		 int input = s.nextInt();
		 if (input == 1) {
			 HashMap<String, Object>map = new HashMap<>();
			 System.out.println("입력 부분: ");
			 map.put("name", s.next());
			 
			 System.out.println("자바 점수를 입력해주세요: ");
			 map.put("java", s.next());
			 map.put("java", score("java", 30));
			
			 System.out.println("오라클 점수를 입력해주세요: ");
			 map.put("oracle", s.next());
			 map.put("oracle", score("oracle", 50));
			 System.out.println("html 점수를 입력해주세요: ");
			 map.put("html", s.next());
			 map.put("oracle", score("oracle", 20));
			 
			 list.add(map);
			 System.out.println("저장되었습니다.");
//			 3). 출력 부분			 
		 } else if(input == 2) {
			 System.out.println("삭제 부분: ");
		 } else if(input == 3) {
			 System.out.println("출력 부분: ");
		 } else {
			 System.out.println("종료되었습니다.");
		 }
		
		 boolean flg = false;
		if (!flg) {
				System.out.println("찾는 사람이 없습니다.");
			} else if (input == 3) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1, 2, 3 중에 하나를 입력해주세요.");
			}
		}
	}
	
	public static void result() {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		String name;
		int totalScore;
		int java;
		int oracle;
		int html;
//		총합 계산
//		System.out.println("이름: " + name + ", 총점" + totalScore);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


	
	
	
	
	
	
}
