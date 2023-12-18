//1. 다음 코드의 문제점을 설명하고, 올바른 방법으로 if문을 다시 작성 하시오.
//String str1 = "자바";
//String str2 = new String("자바");
//if(str1 == str2){ // 문자열 비교
//    // 문자열이 같다면 출력
//};
//
//2. 반복문을 이용하여 구구단을 작성하시오.
//단, 5단은 출력하지 말 것.
//(for, while, do~while중 1가지 선택)
//
//3. 아래와 같이 배열을 선언하고 가장 큰 값과 0번째 인덱스 값과 위치를 바꾸시오.
//    // int arr[] = {3, 5, 2, 9, 8};
//    // 결과 : {9, 5, 2, 3, 8}
//	
//4. 랜덤 구구단 문제를 출력하고 정답을 입력받으시오.
//단, 구구단은 5번 반복하며, 정답 입력 시 정답&오답 여부 및 점수를 출력해주어야 함.
//출력 [ 9 * 7  = 63 ]
//    [ 정답입니다. ]
//    [ 3 * 2 = 10 ]
//    [ 오답입니다. 정답은 6입니다.]
//    [ 2 * 8 = 16 ]
//    [ 정답입니다. ]
//        ..............
//    [ 총 80점입니다. ] // 한문제당 20점
//
//5. * 숫자 1을 입력할 경우 '입력 부분', 2를 입력할 경우 '삭제 부분', 3을 입력할 경우 '출력 부분'
//그 외의 값을 입력할 경우 '종료 부분'을 실행 한다.
//
//1). 입력 부분
//-> key를 String, value를 Object로 받는 HashMap 생성
//-> 다음과 같이 map에 스캐너로 입력된 값 저장
//-> key : name, value : 이름 (ex, 홍길동)
//-> key : java, value : 자바 점수 (ex, 20), 단 0~30 사이 값이 아니면 다시 입력
//-> key : oracle, value : 오라클 점수 (ex, 35), 단 0~50 사이 값이 아니면 다시 입력
//-> key : html, value : html 점수(ex, 15), 단 0~20 사이 값이 아니면 다시 입력
//
//=> 해당 map을 ArrayList 객체에 저장
//
//2). 삭제 부분
//스캐너로 입력한 값과 map의 name value 값이 동일할 경우 리스트에서 삭제
//
//-> ex, 스캐너로 "홍길동"을 입력하면 name의 value가 "홍길동"인 map을 리스트에서 제거
//
//3). 출력 부분
//-> 콘솔에 '이름 : 홍길동, 총점 : 70' 과 같은 형태로 출력
//-> 총점은 java + oracle + html value의 총 합
//
//4). 종료 부분
//-> 프로그램 종료
	
	
	
	
	
	
	
	
//	
//	class PositivePoint extends Point {
//	    public PositivePoint() {
//	        super(0, 0);
//	    }
//
//	    public PositivePoint(int x, int y) {
//	        super(x, y);
//	        if (x < 0 || y < 0) {
//	            super.move(0, 0);
//	        }
//	    }
//
//	    @Override
//	    public void move(int x, int y) {
//	        if (x >= 0 && y >= 0) {
//	            super.move(x, y);
//	        }
//	    }
//
//	    @Override
//	    public String toString() {
//	        return "(" + getX() + "," + getY() + ") point";
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        PositivePoint p = new PositivePoint();
//	        p.move(10, 10);
//	        System.out.println(p.toString() + " is.");
//	        p.move(-5, 5);
//	        System.out.println(p.toString() + " is.");
//	        PositivePoint p2 = new PositivePoint(-10, -10);
//	        System.out.println(p2.toString() + " is.");
//	    }
//	}
	
	
	
	
	
	
	
