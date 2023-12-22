package TestSample2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputTest4Answer {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            boolean inputIsValid = false;

            while (!inputIsValid) {
                System.out.print("숫자를 입력하세요 (1부터 20 사이): ");
                int input = scanner.nextInt();

                // 조건 1: 1부터 20 사이의 값인지 확인
                if (input >= 1 && input <= 20) {
                    // 조건 2: 중복 확인 (2개까지 허용)
                    if (!contains(arr, input, 2)) {
                        arr[i] = input;
                        inputIsValid = true;
                    } else {
                        System.out.println("이미 입력된 숫자입니다. 중복은 2개까지 허용됩니다. 다시 입력하세요.");
                    }
                } else {
                    System.out.println("1부터 20 사이의 숫자를 입력하세요.");
                }
            }
        }

        // 중복 제거 후 정렬
        int[] uniqueArr = removeDuplicates(arr);
        Arrays.sort(uniqueArr);

        // 내림차순으로 출력
        System.out.print("내림차순으로 정렬된 배열: [");
        for (int i = uniqueArr.length - 1; i >= 0; i--) {
            System.out.print(uniqueArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 배열에 특정 값이 count 이상 포함되어 있는지 확인하는 메소드
    private static boolean contains(int[] arr, int value, int count) {
        int occurrence = 0;
        for (int i : arr) {
            if (i == value) {
                occurrence++;
                if (occurrence >= count) {
                    return true;
                }
            }
        }
        return false;
    }

    // 배열에서 중복 제거하는 메소드
    private static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
