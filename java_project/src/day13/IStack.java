package day13;

	// 스택 코드로 구현
	//1. 다음 IStack 인터페이스가 있다.
	public interface IStack<T> {
		public T pop();
		public boolean push(T ob);
	}
