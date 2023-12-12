package day2;

import java.util.Scanner;

public class test_loop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s =  new Scanner (System.in);
       System.out.println("숫자를 입력하세요: ");
       // 구구단
       int num = s.nextInt();
       for (int i = 1; i<=9; i++) {
    	   //System.out.println(num*9);
    	   System.out.println(num + "*" + i + "=" + (num*i));
       }
      //입력한 숫자까지 출력
       for (int i = 1; i <= num; i++) {
    	  System.out.println(i);
      }
      //1부터 30까지, 입력 숫자가 베수일경우
       for (int i = 1; i <= 30; i++) {
    	   if (i % num == 0);
    	   System.out.println(i);
       }
       
	}//main

}//class
