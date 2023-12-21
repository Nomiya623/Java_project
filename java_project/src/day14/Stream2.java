package day14;

import java.io.*;
import java.util.*;

public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InputStreamReader를 이용하여 MS949(UTF-8) 문자 집합으로 
//		한글 텍스트 파일을 읽고 출력하라.

		InputStreamReader in = null;
		FileInputStream fin = null;

		try {
			fin = new FileInputStream("C:\\test\\java.txt");
			in = new InputStreamReader(fin, "UTF-8");
			int c;

			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}
			in.close();
			fin.close();

		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
