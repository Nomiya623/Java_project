package day10_test;

public class ColorTV extends TV {
	int colors;

	public ColorTV(int size, int colors) {
		super(colors);
		this.colors = colors;
	}

	public void printProperty() {
		System.out.println(getSize() + " inches " + colors + "colors");
	}

}
