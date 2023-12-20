package day13;

import java.util.*;

public class Review_Ex2 {

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
		Scanner s = new Scanner(System.in);
		HashMap<String, HashMap<String, Object>> fruitStore = new HashMap<>();
		ArrayList<HashMap<String, Object>> fruitList = new ArrayList<>();

		while (true) {
			System.out.println("1. 추가 2. 판매 3. 개수 확인 4. (그외)종료");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				addFruit(fruitStore, fruitList, s);
			case 2:
				sellFruit(fruitStore, fruitList, s);
			case 3:
				checkQuan(fruitStore, fruitList);
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("올바른 메뉴를 선택하세요.");

			}
		}

	}// main

	private static void addFruit(HashMap<String, HashMap<String, Object>> fruitStore,
			ArrayList<HashMap<String, Object>> fruitList, Scanner s) {
		// TODO Auto-generated method stub
		System.out.println("과일명을 입력하세요: ");
		String fruitName = s.next();
		System.out.println("가격을 입력하세요: ");
		String price = s.next();
		System.out.println("개수를 입력하세요: ");
		Integer quan = s.nextInt();

		if (!fruitStore.containsKey(fruitName)) {
			HashMap<String, Object> fruitDetails = new HashMap<>();
			fruitDetails.put("가격", Integer.parseInt(price));
			fruitDetails.put("개수", quan);
			fruitStore.put(fruitName, fruitDetails);
			fruitList.add(fruitName);
			System.out.println("과일이 추가되었습니다.");
		} else {
			System.out.println("이미 등록된 과일입니다.수정하려면 수정 기능을 이용하세요.");
		}

	}

	private static void sellFruit(HashMap<String, HashMap<String, Object>> fruitStore,
			ArrayList<HashMap<String, Object>> fruitList, Scanner s) {
		// TODO Auto-generated method stub
		
		System.out.println("과일명을 입력하세요: ");
		String fruitName = s.next();
		
		if(fruitStore.containsKey(fruitName)) {
			System.out.println("판매할 개수를 입력하세요.");
			int sellQuan = s.nextInt();
			
			int currentQuan = (int)fruitStore.get(fruitName).get("개수");
			if(currentQuan - sellQuan >=0) {
				fruitStore.get(fruitName).put("개수", currentQuan -sellQuan);
				System.out.println("판매완료.");
			} else {
				System.out.println("재료보죽. 현재 개수: " + currentQuan);
			}
		} else {
			System.out.println("등록되지 않은 상품입니다.이용하려면 추가 기능을 이용하세요.");
		}
		
	

	}

	private static void checkQuan(HashMap<String, HashMap<String, Object>> fruitStore,
			ArrayList<HashMap<String, Object>> fruitList) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("과일명을 입력하세요: ");
		String fruitName = s.next();
		
		if(fruitStore.containsKey(fruitName)){
			int currentQuan = (int)fruitStore.get(fruitName).get("개수");
			System.out.println("현재 " + fruitName + "의 개수:" + currentQuan);
		} else {
			System.out.println("등록되지 않은 상품입니다. 추가하려면 추가 기능을 이용하세요.");
		}
		
		
		
		
	}

}// class
