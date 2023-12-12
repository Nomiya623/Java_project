package pro_day5_review;

import java.util.Arrays;

public class Ex6_Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {-3, 1, -2, 5, -4};
		for(int i=array.length-1; i>=1; i--) {
			for(int j=0; j<i; j++) {
				if(Math.abs(array[j]) > Math.abs(array[j+1])) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		// -(-3)
		for(int i=0; i<array.length; i++) {
//			array[i] = Math.abs(array[i]);
			if(array[i] < 0) {
				array[i] = -array[i];
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
