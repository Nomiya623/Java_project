package day4;

import java.util.Scanner;


public class Ex5_Array {
	public static void main(String[] args) {
		Scanner s =  new Scanner (System.in);
		//a 라는 변수가 브래캣 안에 10가지 숫자를 보관.
		//0번째 넣기 위해 첫번째 갑 10을 포함
		//index; 
//		int a[] =  new int [10];
//		a[0] = 10; //{10, 0, 0 , 0, 0, 0, 0, 0, 0, 0.}
//		a[3] = 30; //{10, 0, 30 , 0, 0}
//		a[9] = 1; //{10, 0, 0 , 0, 0, 0, 0, 0, 1, 0.}
//		System.out.println(a[3]);
		
//		int b[] = {1,2,3,4,5,6,7,8,10}; //b[0] = 1, b[1] = 2, b[2] = 3
		

		//1. 정수형 5개의 공간을 가지는 배열을 생성
		//2. 다섯개의 공간을 값을 넣는데 사용자로부터 입력받아서 넣기
//		int array[] = new int [5];
//		for (int i=0; i < array.length; i++){
//			System.out.println(i+1+ " 번째에 숫자 입력 : ");
//			array[i] =  s.nextInt();
//		}
//		System.out.println(array);
		// System.out.println(Arrays.toString(array));
		
		
		//3. 해당 배열에 있는 평균 값 구하기.
//		int sum = 0;
//		for (int i=0; i<array.length; i++) {
//			sum += array[i];
//		}
//		System.out.println((double) sum / array.length);
		
//		//4. 해당 배열에 있는 값중에서 가장 큰 수 구하기
//		int max = array[0]; //max =0; 문제된다
//		for (int i=0; i<array.length; i++ ) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//			max= (array[i]> array[0]) ? array[i]: array[0]; 
//		}
//		System.out.println(max);
		
		//5. 가장 큰값의 위치
//		int idx = 0;//index
//		for (int i=0; i<=array.length; i++) {
//			if (array[i] > array[idx]) {
//				idx = i;
//			}
//		}
//		System.out.println("큰위치는 " + idx);
		
		//6. 가장 큰 값의 위치를 맨앞으로 이동
		// array [30, 20, 50, 10, 40]
		// array [50, 20, 30, 10, 40]
		
//		int idx1 = 0;
//		for(int i1=0; i1<=array.length; i1++) {
//			if(array[i1] > array[idx1]) {
//				int temp = array[idx];
//				array[0] = array[2];
//				array[idx] = temp;
				
//			}
			
		//7. 가장 큰 값을 위치와 가장 작은 값의 위치
//			for (int j=0; j<array.length; j++ ) {
//				if(array[i]) > array[idx]) {
//					idx=i;
//					int temp= array[idx];
//					array[0] = array [2];
//				}
			
	}//main
}//class
