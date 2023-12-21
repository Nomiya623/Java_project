package TestSample2;

import java.util.*;
//숫자를 1개 입력받고 해당 숫자의 구구단을 출력하시오.
//단, 입력받은 숫자는 2부터 9사이의 값이어야 하며 이외의 값이 입력될 경우 재입력하도록 함
public class MultiTable2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하세요: ");
		int num = s.nextInt();
		if (num < 2 && num > 10){
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
				}
			} else {
			System.out.println("2부터 9사이의 숫자를 입력하세요: ");
		
			}

		}
	}
