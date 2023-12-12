package pro_day5_review;

import java.util.Arrays;

public class Ex7_SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {9, 6, 7, 2, 5};
		
		for(int a=0; a<array.length-1; a++) {
			int minIdx = a; 
			for(int i=a+1; i<array.length; i++) {
				if(array[minIdx] > array[i]) {
					minIdx = i;
				}
			}
			int temp = array[minIdx];
			array[minIdx] = array[a];
			array[a] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
