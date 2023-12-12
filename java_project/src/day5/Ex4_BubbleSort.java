package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int array[] = {3,1,2,5,4};
		for (int j=array.length-1; j>=1; j--) {
			for(int i=0; i<j; i++) {	
				if(array[i]<array[i]+1) {
					int temp = array[i];
					array[i] = array [i+1];
					array[i+1]= temp;	
					}

				}
		}
		System.out.println(Arrays.toString(array));
		
	}//main

}//class
