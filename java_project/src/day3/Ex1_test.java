package day3;

import java.util.Scanner;

public class Ex1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		//0. 1부터 10까지
		// 1. 내가 입력한 숫자로 구구단
		int num = s.nextInt();
		for (int i = 1; i<=9; i++) {
			System.out.println(num + "*"+ i + "=" +(num*i));
		}
		// 2. 1부터 내가 입력한 숫자까지 출력
		for (int i = 1; i<=num; i++) {
			System.out.println(i);
		}
		// 3.1부터 30중 내가 입력한 숫자의 베수를 제외하고 출력
		for (int i=1; i<=30; i++) {
			if (i % num!= 0)
			System.out.println(i);
		}
		// 4. 내가 입력한 숫자까지 중에서
				//3의 배수 구하기
		
		int cnt = 0;// 개수를 구할 때 count
		for (int i1=1; i1<= num; i1++) {
			if (i1 % 3 == 0)
				cnt=cnt+1;//cnt++;
			} 
		System.out.println(cnt + "개");
		}//main
	}//class


