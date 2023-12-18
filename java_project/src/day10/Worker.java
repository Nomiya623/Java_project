package day10;

public class Worker implements Human {

	@Override
	public void walk(int x) {
		// TODO Auto-generated method stub
		System.out.println(x + "미터를 걸었다.");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(food + "먹었다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("잔다.");
	}

	void work() {

		System.out.println("일한다.");
	}

}
