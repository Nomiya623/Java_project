package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex2_multi_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		//1. 2부터 9가지 출력
		for(int i=2; i<=9;i++ ) {
			System.out.println(i);
		}
		//2. 2를 9번, 3를 9번
		for(int i=2; i<=9;i++ ) {
			for(int j=2; j<=i;j++ ) {
			System.out.println(i);
		}
			
		//3. 순서대로 출력
		for(int i1=2; i1<=9;i1++ ) {
			System.out.println("====" + i1 + "단 ====");
			for(int j1=2; j1<=9;j1++ ) {
				System.out.println(i1 + "*" + j1 + "=" + (i1*j1));
				}
			}
		}
	}//main
}//class
