package day9_test;



public class ColorTV extends TV{
	
	
	private int numberOfColors;
	
	public ColorTV(int size, int numberOfColors) {
		super(size);
		this.numberOfColors = numberOfColors;
	}
		public void printProperty() {
	        System.out.println(getSize() + "인치 " + numberOfColors + "컬러");
	    }	

	}	
