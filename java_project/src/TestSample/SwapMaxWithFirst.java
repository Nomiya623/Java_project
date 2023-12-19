package TestSample;

public class SwapMaxWithFirst {

	static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 아래와 같이 배열을 선언하고 가장 큰 값과 0번째 인덱스 값과 위치를 바꾸시오.
		// int arr[] = {3, 5, 2, 9, 8};
		// 결과 : {9, 5, 2, 3, 8}
		int arr[] = { 3, 5, 2, 9, 8 };

		// 최대값과 인덱스 찾기
		int maxIndex = 0;
		int maxValue = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
				maxIndex = i;
			}
		}

		// 0번째 인덱스와 최대값의 위치를 바꿈
		int temp = arr[0];
		arr[0] = maxValue;
		arr[maxIndex] = temp;

		// 결과 출력
		System.out.println("결과: {");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		if (i < arr.length - 1) {
			System.out.println(", ");
		}

	}
	
	//System.out.println("}"); //find error
}
