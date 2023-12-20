package day13;

import java.util.*;

public class FruitStoreProgram_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        HashMap<String, HashMap<String, Integer>> fruitStore = new HashMap<>();
		        ArrayList<String> fruitList = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("1. 추가 2. 판매 3. 개수 확인 4. 종료");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    addFruit(fruitStore, fruitList, scanner);
		                    break;
		                case 2:
		                    sellFruit(fruitStore, scanner);
		                    break;
		                case 3:
		                    checkQuantity(fruitStore, scanner);
		                    break;
		                case 4:
		                    System.out.println("프로그램을 종료합니다.");
		                    System.exit(0);
		                default:
		                    System.out.println("올바른 메뉴를 선택하세요.");
		            }
		        }
		    }

		    private static void addFruit(HashMap<String, HashMap<String, Integer>> fruitStore,
		                                 ArrayList<String> fruitList, Scanner scanner) {
		        System.out.println("과일명을 입력하세요:");
		        String fruitName = scanner.next();

		        if (fruitList.contains(fruitName)) {
		            System.out.println("이미 등록된 과일입니다. 몇 개를 추가하시겠습니까?");
		            int additionalQuantity = scanner.nextInt();
		            int currentQuantity = fruitStore.get(fruitName).get("개수");
		            fruitStore.get(fruitName).put("개수", currentQuantity + additionalQuantity);
		            System.out.println("과일이 추가되었습니다.");
		        } else {
		            System.out.println("가격을 입력하세요:");
		            String price = scanner.next();
		            System.out.println("개수를 입력하세요:");
		            int quantity = scanner.nextInt();

		            HashMap<String, Integer> fruitDetails = new HashMap<>();
		            fruitDetails.put("가격", Integer.parseInt(price));
		            fruitDetails.put("개수", quantity);
		            fruitStore.put(fruitName, fruitDetails);
		            fruitList.add(fruitName);
		            System.out.println("과일이 추가되었습니다.");
		        }
		    }

		    private static void sellFruit(HashMap<String, HashMap<String, Integer>> fruitStore, Scanner scanner) {
		        System.out.println("과일명을 입력하세요:");
		        String fruitName = scanner.next();

		        if (fruitStore.containsKey(fruitName)) {
		            System.out.println("판매할 개수를 입력하세요:");
		            int sellQuantity = scanner.nextInt();

		            int currentQuantity = fruitStore.get(fruitName).get("개수");
		            if (currentQuantity - sellQuantity >= 0) {
		                fruitStore.get(fruitName).put("개수", currentQuantity - sellQuantity);
		                System.out.println("판매가 완료되었습니다.");
		            } else {
		                System.out.println("재고가 부족합니다. 현재 개수: " + currentQuantity);
		            }
		        } else {
		            System.out.println("등록되지 않은 과일입니다. 추가하려면 추가 기능을 이용하세요.");
		        }
		    }

		    private static void checkQuantity(HashMap<String, HashMap<String, Integer>> fruitStore, Scanner scanner) {
		        System.out.println("과일명을 입력하세요:");
		        String fruitName = scanner.next();

		        if (fruitStore.containsKey(fruitName)) {
		            int currentQuantity = fruitStore.get(fruitName).get("개수");
		            System.out.println("현재 " + fruitName + "의 개수: " + currentQuantity);
		        } else {
		            System.out.println("등록되지 않은 과일입니다. 추가하려면 추가 기능을 이용하세요.");
		        }
		    }
		}

