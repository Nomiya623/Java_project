package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex4_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
////		int cnt = 0;
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++ ) {
////				System.out.println(i + cnt + "times");
//				System.out.println(i);
		
		for (int i=9; i>=2; i--){
			System.out.println("====" + i + "단====");
			for (int j=9; j>=2; j--)
				System.out.println(i + " * "+ j + " = " + (i*j));	
		}
		
	}//main

}//class

