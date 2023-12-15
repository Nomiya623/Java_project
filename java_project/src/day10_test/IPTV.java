package day10_test;

public class IPTV extends TV {

String ipAddress;
	public IPTV(String ipAddress, int size, int colors) {
		super(size);
		this.ipAddress = ipAddress;
		
	}
		
	//@Override
	public void printProperty() {
		System.out.println("My IPTV has " + ipAddress + "address" + getSize() + " inches, " + ipAddress + " colors");
	}
		
		
		
		
		
	
	
}
