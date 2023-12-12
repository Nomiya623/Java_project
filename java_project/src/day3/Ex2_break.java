package day3;

import java.util.Scanner;

public class Ex2_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int num1 = s.nextInt();
//		System.out.print("첫번째 숫자를 입력 : ");
//		int num2 = s.nextInt();	
//		System.out.print("두번째 숫자를 입력 : ");
//		
//		for(int i=1; i<=10; i++) {
//			if(i==5) { 
//				break; //5빼고 출력, break 빠져나간다, continue 이어간다
//			}
//			System.out.println(i);
//	//2. 반복문을 이용해서 숫자를 5개 입력하고 입력받은 수의 합을 구하시오.	
//		} 
//		int sum=0;
//			for(int i=1; i<=5; i++) {
//				System.out.print(i + "번째 숫자를 입력 : ");
//				//int num3=s.nextInt; 생략
//				sum+= s.nextInt();
//		}
//		System.out.println(sum);
//	// 3. 반복문을 이용해서 숫자를 10개입력받고
//		//입력받은 합을 구하십시오, 단 0일 경우 즉시 종료
//			for (int i1=1; i1<=10; i1++) {
//				System.out.println(i1 + "번째 숫자를 입력하세요: ");
//				int num3 = s.nextInt();
//				if (num3 ==0);{
//					break;
//				}
//				sum+=num3;
//			}
//		System.out.println("합:" + sum);
	// for(;;) 무한루프, 반복.
//		//for(int i=1; i<=10; i--) {
//		for(;;) {
//				System.out.println("종료(0), 계속(1)");
//				int num = s.nextInt();
//				if (num==0);
//				break;
//			System.out.println("종료되었습니다."); 		
//		} 
	//합산할 숫자를 입력, 무한반복으로 숫자 입력요청
//		int sum=0;
//			int cnt=0;
//		for (;;) {
//			System.out.println("합산할 숫자를 입력하세요: ");
//			int num = s.nextInt();
//			sum+=num;
//			cnt++;
//			System.out.println("종료(0), 계속 (1): ");
//			if (s.nextInt()==0) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//				
//		}
//		System.out.println("총"+ cnt + "숫자의 합" + sum);
		
		//예외 추가
		int sum = 0;
			int cnt = 0; 
			int flg = 1;//처음부터 1입력하고 시작하는 부분. 0일경우 조건이 종료되었습니다 출력.
		for (;;) {
			if (flg==0) {
				System.out.println("종료되었습니다.");
				break;	
			} else if (flg == 1) {
				System.out.println("합산할 숫자를 입력하세요: ");
				int num = s.nextInt();
				sum+=num;
				cnt++;	
			} else {
				System.out.println("0 또는 1만 입력해주세요. ");
			}
			System.out.println("종료(0), 계속 (1): ");
			flg = s.nextInt();	
			}
		System.out.println("총 "+ cnt + " 숫자의 합 : " + sum);
		
		
	}//main

}//class
