package day2;

public class Ex6_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='B';
		switch (grade) {
		case 'A' :
			System.out.println("수고했다!");
		case 'B' :
			System.out.println("굿!");
			break;
		case 'C' :
			System.out.println("낫배드!");
		case 'D' :
			System.out.println("보이");

		default : 
			System.out.println("트라이!");
		}
		
	}

}
