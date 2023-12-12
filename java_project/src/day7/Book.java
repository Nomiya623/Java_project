package day7;

// 같은 클래스의 다른 생성자 호출 생성자 내에서만 사용 가능
// 다른 메소드에서는 사용 불가
// 반드시 생성자 코드의 제일 처음에 수행
public class Book {
	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public Book(String title, int ISBN) {
		this(title, "Anonym", ISBN);
	}

	public Book() {
		this(null, null, 0); // string => null
		System.out.println("생성자가 호출됨");
	}

}// class
