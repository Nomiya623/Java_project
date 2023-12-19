package day12;

import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		// Iterator 를 이용하여 Vector 의 모든 요소를 출력하고 합 구하기
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		// Iterator 를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		// Iterator 를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;

		}
		System.out.println("백터 안에 있는 정수 합: " + sum);

	}
}
