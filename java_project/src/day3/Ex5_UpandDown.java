package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex5_UpandDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		//1부터 100까지 숫차 맞추기
		int random = ran.nextInt(100)+1;
		int cnt = 0;
		for(;;) {
			cnt++;
			System.out.println(cnt + " 번째 시도, 숫자를 입력하세요: ");
			int answer = s.nextInt();
			if(answer == random) {
				System.out.println("정답!" + cnt + " 번째 시도에 맞췄습니다.");
			 break;
			} else if (answer> random) {
				System.out.println("Down");
			} else {
				System.out.println("Up!");
			}
		}
	}//main

}//class
