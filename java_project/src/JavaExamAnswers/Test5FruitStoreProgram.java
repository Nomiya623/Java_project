package JavaExamAnswers;

import java.util.*;
//[문항5]  5. 주제 : 과일 가게 프로그램
//* 숫자 1을 입력할 경우 '과일 추가', 2를 입력할 경우 '과일 삭제', 3을 입력할 경우 '가격 수정',
//4를 입력할 경우 '현황 파악' 그 외의 숫자를 입력할 경우 종료 되도록 한다.
//ex) "=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ==="
//(복사해서 쓰셔도 됩니다.)

	public class Test5FruitStoreProgram {
	    public static void main(String[] args) {
	        ArrayList<HashMap<String, Object>> fruitList = new ArrayList<>();
	        Scanner s = new Scanner(System.in);

	        while (true) {
	            printMenu();
	            int menu = s.nextInt();
	            s.nextLine();  // 개행 문자 처리

	            switch (menu) {
	                case 1:
	                    addFruit(fruitList, s);
	                    break;
	                case 2:
	                    deleteFruit(fruitList, s);
	                    break;
	                case 3:
	                    updatePrice(fruitList, s);
	                    break;
	                case 4:
	                    check(fruitList);
	                    break;
	                default:
	                    System.out.println("프로그램 종료");
	                    return;
	            }
	        }
	    }

	    private static void printMenu() {
	        System.out.println("=== (1) 과일 추가 (2) 과일 삭제 (3) 가격 수정 (4) 현황 파악 (그외) 종료 ===");
	    }

	    private static void addFruit(ArrayList<HashMap<String, Object>> fruitList, Scanner s) {
	        HashMap<String, Object> fruitMap = new HashMap<>();
// 1. 입력 부분
	        System.out.print("과일명 입력: ");
	        String name = s.nextLine();

	        if (isDuplFruit(fruitList, name)) {
	            System.out.println("이미 존재하는 과일입니다. 개수만 입력하여 추가하세요.");
	            return;
	        }

	        System.out.print("가격 입력 (100~10000 사이): ");
	        int price = s.nextInt();

	        while (price < 100 || price > 10000) {
	            System.out.println("100~10000 사이 값이 아니면 다시 입력.");
	            System.out.print("가격 입력 (100~10000 사이): ");
	            price = s.nextInt();
	        }

	        System.out.print("개수 입력 ( 최대 100 개): ");
	        int count = s.nextInt();

	        while (count < 0 || count > 100) {
	            System.out.println("개수는 0에서 100 사이의 값을 가져야 합니다. 다시 입력하세요.");
	            System.out.print("개수 입력 (최대 100개): ");
	            count = s.nextInt();
	        }

	        fruitMap.put("name", name);
	        fruitMap.put("price", price);
	        fruitMap.put("count", count);

	        fruitList.add(fruitMap);
	        System.out.println(name + "이(가) 추가되었습니다.");
	    }

	    private static boolean isDuplFruit(ArrayList<HashMap<String, Object>> fruitList, String name) {
	        for (HashMap<String, Object> fruit : fruitList) {
	            if (name.equals(fruit.get("name"))) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static void deleteFruit(ArrayList<HashMap<String, Object>> fruitList, Scanner s) {
	        System.out.print("삭제할 과일명 입력: ");
	        String name = s.nextLine();

	        Iterator<HashMap<String, Object>> iterator = fruitList.iterator();
	        while (iterator.hasNext()) {
	            HashMap<String, Object> fruit = iterator.next();
	            if (name.equals(fruit.get("name"))) {
	                iterator.remove();
	                System.out.println(name + "이(가) 삭제되었습니다.");
	                return;
	            }
	        }

	        System.out.println(name + "을(를) 찾을 수 없습니다.");
	    }

	    private static void updatePrice(ArrayList<HashMap<String, Object>> fruitList, Scanner s) {
	        System.out.print("과일명 입력: ");
	        String name = s.nextLine();

	        for (HashMap<String, Object> fruit : fruitList) {
	            if (name.equals(fruit.get("name"))) {
	                int currentPrice = (int) fruit.get("price");
	                System.out.println(name + "의 현재 가격은 " + currentPrice + "원 입니다.");

	                System.out.print("가격을 수정해주세요 (기존 가격 " + currentPrice + "): ");
	                int newPrice = s.nextInt();
	                fruit.put("price", newPrice);

	                System.out.println("수정되었습니다!");
	                return;
	            }
	        }

	        System.out.println(name + "을(를) 찾을 수 없습니다.");
	    }

	    private static void check(ArrayList<HashMap<String, Object>> fruitList) {
	        for (HashMap<String, Object> fruit : fruitList) {
	            String name = (String) fruit.get("name");
	            int price = (int) fruit.get("price");
	            int count = (int) fruit.get("count");

	            System.out.println(name + "의 가격은 " + price + "원, 개수는 " + count + "개 남았습니다.");
	        }
	    }
}
