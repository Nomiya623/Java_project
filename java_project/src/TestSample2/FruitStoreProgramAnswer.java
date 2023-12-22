package TestSample2;

import java.util.*;

	public class FruitStoreProgramAnswer {
	    public static void main(String[] args) {
	        ArrayList<HashMap<String, Object>> fruitList = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            printMenu();
	            int menu = scanner.nextInt();
	            scanner.nextLine();  // 개행 문자 처리

	            switch (menu) {
	                case 1:
	                    addFruit(fruitList, scanner);
	                    break;
	                case 2:
	                    deleteFruit(fruitList, scanner);
	                    break;
	                case 3:
	                    updatePrice(fruitList, scanner);
	                    break;
	                case 4:
	                    checkStatus(fruitList);
	                    break;
	                default:
	                    System.out.println("프로그램을 종료합니다.");
	                    return;
	            }
	        }
	    }

	    private static void printMenu() {
	        System.out.println("=== (1) 과일 추가 (2) 과일 삭제 (3) 가격 수정 (4) 현황 파악 (그외) 종료 ===");
	    }

	    private static void addFruit(ArrayList<HashMap<String, Object>> fruitList, Scanner scanner) {
	        HashMap<String, Object> fruitMap = new HashMap<>();

	        System.out.print("과일명 입력: ");
	        String name = scanner.nextLine();

	        if (isDuplicateFruit(fruitList, name)) {
	            System.out.println("이미 존재하는 과일입니다. 개수만 입력하여 추가하세요.");
	            return;
	        }

	        System.out.print("가격 입력 (100~10000 사이): ");
	        int price = scanner.nextInt();

	        while (price < 100 || price > 10000) {
	            System.out.println("가격은 100에서 10000 사이의 값을 가져야 합니다. 다시 입력하세요.");
	            System.out.print("가격 입력 (100~10000 사이): ");
	            price = scanner.nextInt();
	        }

	        System.out.print("개수 입력 (최대 100개): ");
	        int count = scanner.nextInt();

	        while (count < 0 || count > 100) {
	            System.out.println("개수는 0에서 100 사이의 값을 가져야 합니다. 다시 입력하세요.");
	            System.out.print("개수 입력 (최대 100개): ");
	            count = scanner.nextInt();
	        }

	        fruitMap.put("name", name);
	        fruitMap.put("price", price);
	        fruitMap.put("count", count);

	        fruitList.add(fruitMap);
	        System.out.println(name + "이(가) 추가되었습니다.");
	    }

	    private static boolean isDuplicateFruit(ArrayList<HashMap<String, Object>> fruitList, String name) {
	        for (HashMap<String, Object> fruit : fruitList) {
	            if (name.equals(fruit.get("name"))) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static void deleteFruit(ArrayList<HashMap<String, Object>> fruitList, Scanner scanner) {
	        System.out.print("삭제할 과일명 입력: ");
	        String name = scanner.nextLine();

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

	    private static void updatePrice(ArrayList<HashMap<String, Object>> fruitList, Scanner scanner) {
	        System.out.print("과일명 입력: ");
	        String name = scanner.nextLine();

	        for (HashMap<String, Object> fruit : fruitList) {
	            if (name.equals(fruit.get("name"))) {
	                int currentPrice = (int) fruit.get("price");
	                System.out.println(name + "의 현재 가격은 " + currentPrice + "원 입니다.");

	                System.out.print("가격을 수정해주세요 (기존 가격 " + currentPrice + "): ");
	                int newPrice = scanner.nextInt();
	                fruit.put("price", newPrice);

	                System.out.println("수정되었습니다!");
	                return;
	            }
	        }

	        System.out.println(name + "을(를) 찾을 수 없습니다.");
	    }

	    private static void checkStatus(ArrayList<HashMap<String, Object>> fruitList) {
	        for (HashMap<String, Object> fruit : fruitList) {
	            String name = (String) fruit.get("name");
	            int price = (int) fruit.get("price");
	            int count = (int) fruit.get("count");

	            System.out.println(name + "의 가격은 " + price + "원, 개수는 " + count + "개 남았습니다.");
	        }
	    }
}
