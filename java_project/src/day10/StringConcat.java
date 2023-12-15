package day10;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "Java";
		String cpp = "cpp";
		int res = java.compareTo(cpp);
		if(res == 0)
			System.out.println("the same");
		else if(res<0)
			System.out.println(java + "<" + cpp);
		else 
			System.out.println(java + ">" + cpp);
	
		// String concat(String str)를 이용한 문자열 연결
		"I love".concat("Java");
		return;
	}
		
	
//		String s1 = "abcd";
//		String s2 = "efgh";
//		
//		s1 = s1.concat(s2);
		
		
		
		
		
		
		

}
