package day9_test;

public class IPTV extends ColorTV {
	private String ipAddress;

	public IPTV(String ipAddress, int size, int numberOfColors) {
		super(size, numberOfColors);
		this.ipAddress = ipAddress;	
		
		
	//@Override//public void printProperty() {
//		System.out.println("나의 IPTV는 " + ipAddress + "주소의" + getSize() + "인치 " + numberOfColors + "컬러");
		}
	}

