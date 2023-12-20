package TestSample;

import java.util.Scanner;

public class ArrayInput {
	    public static void main(String[] args) {
	        int arr[] = new int[5];
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 5; i++) {
	            int input;
	            do {
	                System.out.println("1부터 10사이의 숫자를 입력하세요:");
	                input = scanner.nextInt();
	            } while (input < 1 || input > 10 || isDuplicate(arr, input));

	            arr[i] = input;
	        }

	        System.out.println("입력된 배열: " + java.util.Arrays.toString(arr));
	    }

	    private static boolean isDuplicate(int[] arr, int num) {
	        for (int value : arr) {
	            if (num == value) {
	                System.out.println("중복된 숫자입니다. 다시 입력하세요.");
	                return true;
	            }
	        }
	        return false;
	    }
	}


