package TestSample2;

import java.util.*;

public class MultiTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		do {
			System.out.println("2부터 9사이의 숫자를 입력하세요: ");
			num = s.nextInt();
		} while (num < 2 || num > 9);

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}
}
