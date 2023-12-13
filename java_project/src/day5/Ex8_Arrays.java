package day5;

import java.util.Arrays;

public class Ex8_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열에서 중복 제거
		// array[] = {10, 20, 5, 10, 30, 5, 10, 25}
		// 결과 = {10, 20, 5, 30, 25} (정렬은 상관x)

		// case1
		int array[] = { 10, 20, 5, 10, 30, 5, 10, 25 };
		int lenght = array.length;

		for (int i = 0; i < lenght; i++) {
			for (int j = i + 1; j < lenght; j++) {
				if (array[i] == array[j]) {
					int shiftLeft = j;//중복제거
					for (int k = j + 1; k < lenght; k++) {
						array[shiftLeft] = array[k];
					}
					lenght--;
					j--;
				}
			}
		}
		int newArray[] = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			System.out.println(array[i] + " ");
			newArray[i] = array[i];
		}
		System.out.println(Arrays.toString(newArray));

	}

}
