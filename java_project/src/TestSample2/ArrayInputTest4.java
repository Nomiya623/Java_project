package TestSample2;

import java.util.*;

public class ArrayInputTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 배열을 아래와 같이 선언하고, 조건에 맞게 5개의 숫자를 입력받아서 배열에 순차적으로 넣으시오.
//		int arr[] = new int[5];
//		조건 1) 입력받은 숫자는 1부터 20사이의 값이어야 하며, 이외의 숫자를 입력할 경우 재입력하도록 한다.
//		조건 2) 기존에 입력된 숫자와 중복은 2개까지만 허용 된다. 2개 이상이 될 경우 재입력하도록 한다.
//		조건 3) 배열을 새롭게 선언하고 중복된 값이 없는 형태로 배열 값을 입력한 후 내림차순 한다.
//		ex) [1,3,4,1,2] => [4,3,2,1] (1은 중복되므로 하나의 값만 입력)


		int arr[] = new int[5];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			boolean inputIsValid = false;

			while (!inputIsValid) {
				System.out.println("숫자를 입력하세요 (1부터 20사이) : ");
				int input = s.nextInt();

//	조건 1) 입력받은 숫자는 1부터 20사이의 값이어야 하며, 이외의 숫자를 입력할 경우 재입력하도록 한다.	

				if (input >= 1 || input <= 20) {
//		조건 2) 기존에 입력된 숫자와 중복은 2개까지만 허용 된다. 2개 이상이 될 경우 재입력하도록 한다.			
					if (!contains(arr, input, 2)) {
						arr[i] = input;
						inputIsValid = true;
					} else {
						System.out.println("이미 등록된 숫자입니다. 2개가지 숫자만 중복 허용됩니다.");
					}
				} else {
					System.out.println("1부터 20사이 숫자를 입력하세요.");
				}

			}

		}
//		조건 3) 배열을 새롭게 선언하고 중복된 값이 없는 형태로 배열 값을 입력한 후 내림차순 한다.
//		ex) [1,3,4,1,2] => [4,3,2,1] (1은 중복되므로 하나의 값만 입력)	
		
		
		int[]duplArr = removeDupl(arr);
		Arrays.sort(duplArr);
		
		System.out.print("내림차순으로 정리된 배열: [");
			for(int i= duplArr.length-1; i>=0; i--) {
				System.out.print(duplArr[i]);
				if(i>0) {
					System.out.print(", ");
				}
			}
		System.out.print("]");
		
//		출력
		System.out.print("배열 결과: [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

	private static boolean contains(int[] arr, int input, int count) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i : arr) {
			if (i == input) {
				res++;
				if(res>=count) {
					return true;
				}
			}
		}
		
		
		return false;
		

		
		
		
	}

	private static int[] removeDupl(int[] arr) {
		// TODO Auto-generated method stub
		return Arrays.stream(arr).distinct().toArray();
	}



}
