package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex6_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int random = ran.nextInt(50)+1;
		int cnt = 0;
			for (;;) {
				cnt++;
				System.out.println(cnt + "  times try, insert the number: ");
				int answer = s.nextInt();
				if (answer == random) {
					System.out.println("Correct! " + cnt + "times try.");
					break;
				} else if (answer< random) {
					System.out.println("Up");
				} else {
					System.out.println("Down");
				}	
			}
			
			
			int cnt1 = 0;
			for (int i=0; i<5; i++) {
				int a =  ran.nextInt(8)+2;
				int b = ran.nextInt(9)+1;
				
				System.out.println(a + "*" + b +"=" );
				int answer = s.nextInt();
				if (answer == (a*b)) {
					System.out.println("정답! ");
					cnt1++;
				} else {
					System.out.println("오답!, 정답은: " + (a*b));
				} 
					System.out.println("5문제 풀이 끝!");
					System.out.println((cnt*20) +  "점입니다"+ "한문제당 20점");
			}		
	}//main

}//class
