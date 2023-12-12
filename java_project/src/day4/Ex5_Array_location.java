package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex5_Array_location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		// while (1부터 9까지 출력)
//		while(i<=9) {
//			System.out.println(i);
//			i++;
//		}
		// while문을 이용해서 1부터 사용자가
		// 입력한 숫자까지의 합
		// 10을 입력하면 1부터 10까지의 합

		System.out.println("숫자 하나 입력하세요 : ");
		int num = s.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum = sum + i; // sum += i;
		}
		
		int i=1;
		while(i<=num) {
			sum = sum + i; // sum += i;
			i++;
		}
		System.out.println(sum);
		// while문을 이용해서 1부터 사용자가
		// 입력한 숫자에서 홀수들의 합
		// 10을 입력하면 1부터 10까지 중에 홀수들 합
		// ex) 1 3 5 7 9 의 합
		System.out.println("숫자 하나 입력하세요 : ");
		int num1 = s.nextInt();
		int i1 = 1;
		int sum1 = 0;
		while(i1 <= num1) {
			if(i % 2 != 0) {
				sum1 += i1;
			}
			i1++;
		}
		System.out.println(sum);
		// while 을 이용한 Up&Down

		int random = ran.nextInt(100) + 1; // 1~100
		int cnt = 0;
		System.out.println("1부터 100사이의 숫자를 입력해주세요.");
		while(true) {
			cnt++;
			System.out.print(cnt + "번째 숫자 입력 : ");
			int input = s.nextInt();
			
			if(input < 1 || input > 100) {
				System.out.println("1부터 100사이의 숫자를 입력하세요.");
				cnt--;
			} else if(input == random) {
				System.out.print("정답입니다 ! ");
				System.out.println(cnt + " 번째에 정답을 맞추셨습니다.");
				break;
			} else if(input > random){
				System.out.println("Down");
			} else {
				System.out.println("Up");
			}
			
		}
		// 구구단
		for(int c=9; c>=2; c--) {
			System.out.println("===== " + i + "단 ======");
			for(int d=9; d>=1; d--) {
				System.out.println(
						c + " * " + d + " = " + (c*d));
			}
		}
		// 배열 선언
		int a[] = new int[10];
		a[0] = 10; // {10, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		a[3] = 30; // {10, 0, 0, 30, 0, 0, 0, 0, 0, 0}
		a[9] = 1; // {10, 0, 0, 30, 0, 0, 0, 0, 0, 1}

		int b[] = {1,2,3,4,5,6,7}; // b[0] = 1, b[1] = 2, b[2] = 3
		//		System.out.println(b.length);
		for(int i3=0; i3<b.length; i3++) {
			System.out.println(b[i3]);
		}
		
		int c[] = new int[5];
		for(int i4=0; i4<c.length; i4++) {
			c[i4] = i4+1;
		}
		// 배열 입력
		int array[] = new int[5];
		for(int i4=0; i4<array.length; i4++) {
			System.out.print(i4+1 + "번째 숫자 입력 : ");
			array[i4] = s.nextInt();
		}
		// 배열 값 확인
		System.out.println(Arrays.toString(array));
		
		// 평균

		int sum5 = 0;
		for(int i5=0; i5<array.length; i5++) {
			sum5 += array[i5];
		}
		System.out.println((double) sum / array.length);
		
		// 배열에서 큰 값 구하기
		int max = array[0]; 
		for(int i6=1; i6<array.length; i6++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
			// 삼항연산자
			max = (array[i6] > max) ? array[i6] : max;
		}
System.out.println(max);

// 가장 큰 값의 위치와 첫번째 값 위치 변경
		int idx = 0; 
		// array = [30, 20, 50, 10, 40]
		for(int i7=1; i7<=array.length; i7++) {
			if(array[i7] > array[idx]) {
				idx = i7;
			}
		}
		System.out.println("큰 수의 위치 index : " + idx);
		
		int temp = array[0]; 
		array[0] = array[idx]; 
		array[idx] = temp;

// 가장 큰 값의 위치와 가장 작은 값의 위치 변경
		int maxIdx = 0;
		int minIdx = 0;
		for(int i8=1; i8<array.length; i8++) {
			if(array[i8] > array[maxIdx]) {
				maxIdx = i8;
			}
			if(array[i8] < array[minIdx]) {
				minIdx = i8;
			}
//			maxIdx = 
//				(array[i] > array[maxIdx]) ? i : maxIdx;
		}
		int temp2 = array[minIdx];
		array[minIdx] = array[maxIdx];
		array[maxIdx] = temp2;
		
	}

}
