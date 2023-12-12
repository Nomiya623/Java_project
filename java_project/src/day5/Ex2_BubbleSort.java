package day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int array[] = {7,4,5,1,3};
		for(int a=0; a<array.length-1; a--) {
			for(int i=0; i<a; i++) {
			//0~ (i-1)까지 반복
			//i=0; [0,1,2,3,4]
			//i=0; {4,7,5,1,3}
			//i=1; {4,5,7,1,3} 
			//i=2; {4,5,1,7,3}
			//i=3; {4,5,1,3,7}
				if (array[i]>array[i+1]) {
					int temp = array[i];
					array[i+1] = array[i];
					array[i] = temp;
				} 
			}
		}				
				System.out.println(Arrays.toString(array));
			//for (int i=0; i<array.length-2;i++) {
			
		
		
			
	}//main

}//class
