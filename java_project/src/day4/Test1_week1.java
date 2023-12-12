package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1_week1 {

	private static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
//		1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력

		for(int i=10; i<=50; i++) {
					if(i % 3 == 0 && i % 2 == 0) {
						System.out.println(i);
					}
				}

//		2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력


				System.out.print("첫번째 숫자 입력 : ");
				int num1 = s.nextInt();
				System.out.print("두번째 숫자 입력 : ");
				int num2 = s.nextInt();
				if((num1+num2) > 10) {
					System.out.println("큰 수");
				} else {
					System.out.println("작은 수");
				}

//		3. 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
//		(ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)

				System.out.print("숫자 입력 : ");
				int num3 = s.nextInt();
				for(int i=1; i<=9; i++) {
					System.out.println(num3 + " * " + i + " = " + (num3*i));
				}


//		4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//		큰 수 인지 아닌지 판별하기
//		(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 작다고 출력)

				int random = ran.nextInt(100) + 1;
				System.out.print("숫자 입력 : ");
				int input = s.nextInt();
				if(input >= random) {
					System.out.println("입력한 수가 크거나 같다");
				} else {
					System.out.println("입력한 수가 작다");
				}


		//5. 2단부터 9단까지 구구단 출력

		for(int i=2; i<=9; i++) {
					System.out.println("====== " + i + " 단 =====");
					for(int j=1; j<=9; j++) {
						System.out.println(i + " * " + j + " = " + (i*j));
					}
				}

		//6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
		//단, 0이하의 수를 입력하면 넣지 말고 다시 입력 받을 것 
			//=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 각정하고 진행하세요
		 
				int array[] = new int[5];
				int cnt = 0;
				while(true) {
					System.out.print((cnt + 1) + "번째 숫자 입력 : ");
					int input1 = s.nextInt();
					if(input > 0) {
						array[cnt] = input;
						cnt++;
					} else {
						System.out.println("0보다 큰 수 입력하셔");
					}
					if(cnt >= 5) {
						break;
					}
				}
				System.out.println(Arrays.toString(array));

		//7. 6번에서 정의한 배열에서 홀수들의 합 구하기

		int oddSum = 0;
				for(int i=0; i<array.length; i++) {
					if(array[i] % 2 != 0) {
						oddSum += array[i];
					}
				}
				System.out.println("홀수 합 : " + oddSum);


		//8. 6번에서 정의한 배열에서 가장 큰 수와 가장 작은 수의 차이 구하기

		int max = array[0];
				int min = array[0];
				for(int i=0; i<array.length; i++) {
					max = (array[i] > max) ? array[i] : max;
					min = (array[i] < min) ? array[i] : min;
				}
				System.out.println("큰 수와 작은 수 차이는 " + Math.abs((max-min)));


		//9. 이미지를 참고하고 해당 이미지처럼 동작하도록 구현


		Random ra = new Random(); // 랜덤 숫자
				int cnt1 = 0;
				while (true) {
					System.out.print("문제수를 입력해주세요 : ");
					int num = s.nextInt();
					for (int i = 0; i < num; i++) {
						int num4 = ra.nextInt(8) + 2;
						int num5 = ra.nextInt(9) + 1;
						System.out.print(num4 + " * " + num5 + " = ");
						int dap = s.nextInt();
						if (dap == (num4 * num5)) {
							System.out.println("정답.");
							cnt++;
						} else {
							System.out.println("오답. 정답은 " + (num4 * num5) + "입니다.");
						}
					}
					System.out.println("총 " + num + "문제 중 " + cnt + "개 정답!" );
					System.out.println("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요.");
					int exit = s.nextInt();
					if (exit == 0) {
						break;
					} else {
						cnt = 0;
					}
				}
				System.out.println("종료되었습니다.");			
	}//main

}//class
