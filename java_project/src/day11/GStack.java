package day11;

public class GStack<T> {
// Stack LIFO last in first out;
// Queue FIFO first in first out.
	int tos;
	Object[] stck;

	public GStack() {
		tos = 0;
		stck = new Object[10];
	}

	public void push(T item) {
		if (tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		if (tos == 0)
			return null;
		tos--;
		return (T) stck[tos];
	}

}
