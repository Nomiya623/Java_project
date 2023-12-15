package day10;

public class SamsungPhone implements MobileInterface {

	@Override
	public void sendCall() {
		System.out.println("전화걸기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 받았습니다");
	}

	@Override
	public void sendSMS() {
		System.out.println("메세지 보내기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("메세지 받았습니다");
		// TODO Auto-generated method stub
		
	}

}
