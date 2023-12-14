package day9_test;

public class ClassTest {





//	[3번]다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
//
//	- int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
//	- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
//	- int square() : 사각형 넓이 리턴
//	- void show() : 사각형의 좌표와 넓이를 화면에 출력
//	- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
//	- main() 메소드의 코드와 실행 결과는 다음과 같다
//	public static void main(String[] args) {
//	   Rectangle r = new Rectangle(2, 2, 8, 7);
//	   Rectangle s = new Rectangle(5, 5, 6, 6);
//	   Rectangle t = new Rectangle(1, 1, 10, 10);
//	   
//	   r.show();
//	   System.out.println("s의 면적은 "+s.square());
//	   if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
//	   if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
//	}
//	(2,2)에서 크기가 8x7인 사각형
//	s의 면적은 36
//	t는 r을 포함합니다.

//	[4번]
//	다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
//
//	class ArrayUtil {
//	   public static int[] concat(int[] a, int[] b) {
//	            /* 배열 a와 b를 연결한 새로운 배열 리턴 */
//	   }
//	   public static void print(int[] a) {
//	      /* 배열 a 출력 */
//	   }
//	}
//
//	public class StaticEx {
//
//	   public static void main(String[] args) {
//	      // TODO Auto-generated method stub
//	      int[] array1 = {1, 5, 7, 9};
//	      int[] array2 = {3, 6, -1, 100, 77};
//	      int[] array3 = ArrayUtil.concat(array1, array2);
//	      ArrayUtil.print(array3);
//	   }
//
//	}
//
//	[ 1  5  7  9  3  6  -1  100  77 ]

//	[5번]
//	다음과 같은 Dictionary 클래스가 있다. 실행 결과와 같이 작동하도록 Dictionary 클래스의 kor2Eng() 메소드와 DicApp 클래스를 작성하라.
//
//	class Dictionary {
//	   private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
//	   private static String[] eng = {"love", "baby", "money", "future","hope"};
//	   public static String kor2Eng(String word) { /*검색 코드 작성*/ }
//	}
//	한영 단어 검색 프로그램입니다.
//	한글 단어?희망
//	희망은 hope
//	한글 단어?아가
//	아가는 저의 사전에 없습니다.
//	한글 단어?아기
//	아기는 baby
//	한글 단어?그만

	// 텍스트 입력은 Scanner클래스 객체의 next()메소드를 이용하여 입력받을 수 있다.
	
	
	
	
	
}
