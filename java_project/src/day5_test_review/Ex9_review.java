package day5_test_review;

import java.util.Arrays;
import java.util.Random;

public class Ex9_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열에서 값의 위치 변경
		
		// 1. 정수를 담을 수 있는 크기가 6인 배열 생성
		// 배열 이름은 arr
		int arr[] = new int[6];
		
		// 2. 랜덤한 숫자 6개 넣기
		// 랜덤 숫자의 범위는 1~30
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
		}
		System.out.println(
				"랜덤 배열 설정 : " + Arrays.toString(arr));
		
		// 3. 배열 내의 있는 값들의 총 합
		// "총 합 : ooo"
		int sum = 0;
		for(int v : arr) {
			sum += v;
		}
		System.out.println("총 합 : " + sum);
		
		// 4. 위 배열에서 15이상의 숫자들만 따로빼서
		// 새로운 배열을 만들기
		// 배열명은 arr2
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 15) {
				cnt++;
			}
		}
		int arr2[] = new int[cnt];
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 15) {
				arr2[idx++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		
		// 5. arr배열에서 짝수들을 음수로 바꾸기
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 6. arr배열에서 홀수들의 합과 짝수들의 합의 차이 구하기
		// 결과는 무조건 양수로
		int oddSum = 0;
		int evenSum = 0;
		for(int v : arr) {
			if(v % 2 == 0) {
				evenSum += v;
			} else {
				oddSum += v;
			}
		}
		System.out.println(oddSum - evenSum);
		
		
		// 7. arr 배열에서 가장 큰 값 구하기
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		// 8. arr에서 가장 큰 수의 위치(index)값 찾기
		int index = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[index] < arr[i]) {
				index = i;
			}
		}
		
		// 8-1. 가장 큰 값의 위치랑 첫번째 값의 위치랑 변경
		int temp = arr[0];
		arr[0] = arr[index];
		arr[index] = temp;
	}
}
