package day6;

public class Calculator {
	//함수 생성
	//이름: sum
	//파라미터 정수형 2 개 받기
	//리턴: 파라미터로 받은 2개의 값을 더해서 리턴
	//public. private, protected, 디폴트(접근 지정자 생략된 경우)

	int getSum(int i, int j) {
		int sum;
		sum=i+j;
		return sum;
		}
	
	
	int getSum (int i, int j, int k) {
		return i+j+k;
	}
	
	//정수 +실수
	double getSum(double i, double j) {
		return i+j;
	}	
	//오버로딩: 매개변수 개수가 다르거나
	//매개변숭(파라미터)의 타입이 다르거나
		//주의: 변수명 다르다고 정의 안됨
		//리턴타입 다르다거 정의 안됨.
	
}//class

