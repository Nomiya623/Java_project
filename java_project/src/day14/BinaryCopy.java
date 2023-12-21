package day14;

import java.io.*;

public class BinaryCopy {
	private static double beforeTime;

	public static void main(String[] args) {
		File src = new File("c:\\test\\testImage.jpg");
		File dest = new File("c:\\test\\copyimg.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while ((c = fi.read()) != -1) {
				fo.write((byte) c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		double secDiffTime = (afterTime - beforeTime)/10000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		
		
		
		
	}
}




//real answer
//File src = new File("c:\\test\\test.jpg");
//File dest = new File("c:\\test\\copyimg2.jpg");
//double beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//try {
//	FileInputStream fi = new FileInputStream(src);
//	FileOutputStream fo = new FileOutputStream(dest);
//	byte[] buf = new byte[1024 * 10]; // 10KB 버퍼
//	while (true) {
//		int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
//		fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
//		if (n < buf.length)
//			break;
//	}
//	fi.close();
//	fo.close();
//	System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
//} catch (IOException e) {
//	System.out.println("파일 복사 오류");
//}
//double afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//double secDiffTime = (afterTime - beforeTime)/10000; //두 시간에 차 계산
//System.out.println("시간차이(m) : "+secDiffTime);


