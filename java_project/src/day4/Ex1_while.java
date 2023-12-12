package day4;

import java.util.Random;
import java.util.Scanner;

public class Ex1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		//반복문 for, while, do ~ while.
		// for(int i=1; i<=9, i++){
		//System.out.println(i++);
		//}
//		int i = 1;
//		//while(true) {
//		while(i<=9) {
//			System.out.println(i);
//			i++;
//		}
//	// while문을 이용해서 1부터 사용자가 입력한 숫자 합
//		System.out.println("숫자를 입력해주세요: ");
//		
		int num=s.nextInt();	
//		int i1 = 1;
//		int sum=0;
//		while (i1<= num) {
//			System.out.println(sum);
//			sum+=i1;
//			i1++;
//		}
		//while문을 이용해서 1부터 사용자가 입력한 홀수들 숫자 합
//		System.out.println("insert the random number: ");
//		int num = s.nextInt();
//		int i = 1;
//		int sum=0;
//		while (i<=num) {
//			if(i % 2 != 0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
	
		// while the 'up and down' game
		//1부터 100까지
		
		int random = ran.nextInt(100)+1;
		int cnt = 0;
		System.out.println("1부터 100까지 숫자를 입력하세요. ");
		while (true) {
			cnt++;
			System.out.println(cnt + " 번째 숫자, 숫자를 입력하세요");
			int input = s.nextInt();
			if(input < 1 || input > 100) {
				System.out.println("1부터 100사이 숫자를 입력하세요.");
				cnt--;
			} else if(input == random) {
				System.out.println("정답입니다. ");
				System.out.println(cnt + " 번째에 정답입니다. ");
				break;
			} else if(input > random) {
				System.out.println("Up");
			} else {
				System.out.println("Down");
			}
		}
	}//main

}//class
