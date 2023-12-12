package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6_Select_Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array[] = {6,9,7,3,5};
		//선택정렬 내림차순 진행
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int array[] = {6,9,7,3,5};
		int maxIdx = 0;
		for(int i=0; i<array.length-1; i++) {
			if(array[i] > array[maxIdx]) {
				maxIdx = i;
				}
			int temp = array[maxIdx];
			array[maxIdx] = array[0];
			array[0]= temp;
		}
		System.out.println(Arrays.toString(array));
		
		
	}//main

}//class
