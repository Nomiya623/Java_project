package day5_test_review;

import java.util.Arrays;

public class Ex4_BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 1, 2, 5, 4};
		for(int a=array.length-1; a>=1; a--) {
			for(int i=0; i<a; i++) {
				if(array[i] < array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
	}
}
