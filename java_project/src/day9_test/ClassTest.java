package day9_test;

public class ClassTest {

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

//	class ArrayUtil {
//	    public static int[] concat(int[] a, int[] b) {
//	        // Concatenate arrays a and b
//	        int[] result = new int[a.length + b.length];
//	        System.arraycopy(a, 0, result, 0, a.length);
//	        System.arraycopy(b, 0, result, a.length, b.length);
//	        return result;
//	    }
//
//	    public static void print(int[] a) {
//	        // Print the elements of array a
//	        System.out.print("[ ");
//	        for (int i = 0; i < a.length; i++) {
//	            System.out.print(a[i]);
//	            if (i < a.length - 1) {
//	                System.out.print(" ");
//	            }
//	        }
//	        System.out.println("]");
//	    }
//	}
//
//	public class StaticEx {
//
//	    public static void main(String[] args) {
//	        int[] array1 = {1, 5, 7, 9};
//	        int[] array2 = {3, 6, -1, 100, 77};
//	        int[] array3 = ArrayUtil.concat(array1, array2);
//	        ArrayUtil.print(array3);
//	    }
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
//	import java.util.Scanner;
//
//	class Dictionary {
//	    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
//	    private static String[] eng = {"love", "baby", "money", "future", "hope"};
//
//	    public static String kor2Eng(String word) {
//	        for (int i = 0; i < kor.length; i++) {
//	            if (kor[i].equals(word)) {
//	                return eng[i];
//	            }
//	        }
//	        return "저의 사전에 없습니다.";
//	    }
//	}
//
//	public class DicApp {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.println("한영 단어 검색 프로그램입니다.");
//
//	        while (true) {
//	            System.out.print("한글 단어?");
//	            String input = scanner.next();
//
//	            if (input.equals("그만")) {
//	                System.out.println("프로그램을 종료합니다.");
//	                break;
//	            }
//
//	            String result = Dictionary.kor2Eng(input);
//	            System.out.println(input + "은(는) " + result);
//	        }
//
//	        scanner.close();
//	    }
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//상속형	
	
//	class ColorTV extends TV {
//	    private int colors;
//
//	    public ColorTV(int size, int colors) {
//	        super(size);
//	        this.colors = colors;
//	    }
//
//	    public void printProperty() {
//	        System.out.println(getSize() + " inches " + colors + " colors");
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        ColorTV myTV = new ColorTV(32, 1024);
//	        myTV.printProperty();
//	    }
//	}
//	
	

//	
//	class IPTV extends ColorTV {
//	    private String ipAddress;
//
//	    public IPTV(String ipAddress, int size, int colors) {
//	        super(size, colors);
//	        this.ipAddress = ipAddress;
//	    }
//
//	    @Override
//	    public void printProperty() {
//	        System.out.println("My IPTV has " + ipAddress + " address, " + getSize() + " inches, " + colors + " colors");
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
//	        iptv.printProperty();
//	    }
//	}
//	
	
	
	
	
//	class ColorPoint extends Point {
//	    private String color;
//
//	    public ColorPoint(int x, int y, String color) {
//	        super(x, y);
//	        this.color = color;
//	    }
//
//	    public void setColor(String color) {
//	        this.color = color;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return color + " color point at (" + getX() + "," + getY() + ")";
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//	        cp.setXY(10, 20);
//	        cp.setColor("RED");
//	        String str = cp.toString();
//	        System.out.println(str + " is.");
//	    }
//	}
	
	
//	class ColorPoint extends Point {
//	    private String color;
//
//	    public ColorPoint() {
//	        super(0, 0);
//	        this.color = "BLACK";
//	    }
//
//	    public ColorPoint(int x, int y) {
//	        super(x, y);
//	        this.color = "BLACK";
//	    }
//
//	    public void setColor(String color) {
//	        this.color = color;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return color + " color point at (" + getX() + "," + getY() + ")";
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        ColorPoint zeroPoint = new ColorPoint(); // (0,0) BLACK point
//	        System.out.println(zeroPoint.toString() + " is.");
//	        ColorPoint cp = new ColorPoint(10, 10); // (10,10) BLACK point
//	        cp.setXY(5, 5);
//	        cp.setColor("RED");
//	        System.out.println(cp.toString() + " is.");
//	    }
//	}
	
	
	
//	
//	class Point3D extends Point {
//	    private int z;
//
//	    public Point3D(int x, int y, int z) {
//	        super(x, y);
//	        this.z = z;
//	    }
//
//	    public void moveUp() {
//	        z++;
//	    }
//
//	    public void moveDown() {
//	        z--;
//	    }
//
//	    public void move(int x, int y) {
//	        super.move(x, y);
//	    }
//
//	    public void move(int x, int y, int z) {
//	        super.move(x, y);
//	        this.z = z;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return "(" + getX() + "," + getY() + "," + z + ") point";
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        Point3D p = new Point3D(1, 2, 3);
//	        System.out.println(p.toString() + " is.");
//	        p.moveUp();
//	        System.out.println(p.toString() + " is.");
//	        p.moveDown();
//	        p.move(10, 10);
//	        System.out.println(p.toString() + " is.");
//	        p.move(100, 200, 300);
//	        System.out.println(p.toString() + " is.");
//	    }
//	}
//	
	
	
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
}
