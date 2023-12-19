package day11;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
//1.  1부터 45까지 6개 랜덤한 숫자 출력

	public static void main(String[] args) {
		Random ran = new Random();

		int[] ranNum = new int[6];
		for (int i = 0; i < 6; i++) {
			ranNum[i] = ran.nextInt(45) + 1;
		}

		Arrays.sort(ranNum);
		System.out.println(Arrays.toString(ranNum));
		
		
		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.random() * 45 + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
//		for(int j=0; j<i; j++) {
//			if(arr[i] == arr[j]) {
//				i--;
//				break;
//			}
//			Arrays.sort(arr);
//			System.out.println(Arrays.toString(arr));	
//		}
		
	}
}
