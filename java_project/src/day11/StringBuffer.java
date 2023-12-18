package day11;

public class StringBuffer {

	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);
		sb.insert(7, " my"); // "my" 문자열 삽입
		System.out.println(sb);
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		sb.delete(8, 13); // "your " 삭제
		System.out.println(sb);
		sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}

	private void setLength(int i) {
		// TODO Auto-generated method stub
		
	}

	private void delete(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void replace(int i, int j, String string) {
		// TODO Auto-generated method stub
		
	}

	private void insert(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
