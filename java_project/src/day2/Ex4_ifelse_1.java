package day2;

import java.util.Scanner;

public class Ex4_ifelse_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("숫자를 입력하세요. : ");
		int num1 = s.nextInt(); 
		//기본 명령어
		if (num1 >= 90) {
			System.out.println("A 등급니다.");
		} else if(num1>= 80) {
			System.out.println("B 등급입니다.");
		} else if(num1>= 70) {
			System.out.println("C 등급입니다.");
		} else if(num1>= 60) {
			System.out.println("D 등급입니다.");
		} else {
			System.out.println("F 등급입니다.");
		}
	}
}