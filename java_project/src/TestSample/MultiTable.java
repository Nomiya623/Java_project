package TestSample;

public class MultiTable {

	public static void main(StringComparison[] args) {
		// TODO Auto-generated method stub
		// for 문을 이용한 구구단 작성

		for (int i = 2; i <= 9; i++) {
			// 5단을 출력하지 않음
			if (i == 5) {
				continue;
			}

			System.out.println("======="+ i + "단=======");

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
