package day10;

public class PointMain {
	public static void main(String[] args) {
		Point p = new Point(1, 2);
		System.out.println(p);
		Point p2 = new Point(1, 2);

		System.out.println(p == p2);// false
		String name = "Hong Gil Dong";

		System.out.println("Hong Gil Dong".equals(name));
		System.out.println(name.equals("Hong Gil Dong"));

		p.equals(p2);
		boolean flg = (p.equals(p2));
		System.out.println(p.equals(p2));

		System.out.println(p2);
		System.out.println("p => " + p);
		System.out.println("p.getClass => " + p.getClass());
		System.out.println("p.toString => " + p.toString());
	}

	Rect r1 = new Rect(3, 4);
	Rect r2 = new Rect(4, 3);

	Rect a = new Rect(2, 3);
	Rect b = new Rect(3, 2);
	Rect c = new Rect(3, 4);

	boolean flg = (a.equals(b));
	Integer i = Integer.valueOf(10);
	int a1 = i.intValue();
}