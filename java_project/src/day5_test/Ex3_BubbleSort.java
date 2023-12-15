package day5_test;

import java.util.Arrays;

public class Ex3_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {7,4,5,1,3};
		for(int a=array.length-1; a>=1; a--) {
			for(int i=0; i<a; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
//		for(int i=4; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.println(i);
//			}
//		}
		
	}

}
