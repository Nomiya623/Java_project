package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex5_SelectSort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		//quicksort 방법
		int array []= {9,6,7,1,5};
		int minIdx=0;
		for (int i=0; i<array.length;i++) {
				if(array[i]< array[minIdx]) {
					minIdx = i;
				}
			
			int temp = array[minIdx];
			array[minIdx]=array[0];
			array[0]=temp;
			System.out.println(Arrays.toString(array));
			
			
			
			for (int a=0; a<array.length-1; a++) {
				int midIdx = a; //{2, 6, 7, 9, 5}
				for (int i1=1; i<array.length;i++) {
					if(array[i]< array[minIdx]) {
						minIdx = i;
						}
					}
			int temp1 = array[minIdx];
			array[minIdx]=array[1];
			array[1]=temp;
			System.out.println(Arrays.toString(array));
			}
		}
	}//main

}//class
