package day9;

public class Book {
	String title;
	String author;
	int num;
	
public Book(String title, String author, int num) {
	this.title = title;
	this.author = author;
	this.num = num;

}	
public Book(String title, int num) {
	this (title, "Anonymous", num);
	
	
//	this.title = title;// 다른 방법
//	this.author = "익명";
//	this.num = num;
	
}

public Book() {
	this(null, null, 0);
	
//	this.title = null;//다른방법
//	this.author = null;
//	this.num = 0;
	
	System.out.println("생상자가 호출되었습니다.");
}
	

}
