package day14;

import java.io.FileReader;
import java.io.IOException;

//FileReader를 이용하여 c:\windows\system.ini 파일을 읽어 화면에 출력하는 프로그램을 
//작성하라. system.ini는 텍스트 파일이다
public class Stream {
	public static void main(String[] args) {
	FileReader fin = null;
	
	try {
		fin = new FileReader("C:\\test\\system.ini");
		int c;
		while((c=fin.read()) != -1) {//파일의 끝을 만나면 read()는 -1 리턴

			System.out.print((char)c);
		}
	} catch (IOException e){
		System.out.println("입출력 오류");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}	
	
