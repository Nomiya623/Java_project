package day9_test;



public class ColorTV extends TV{
	
	
	protected int Colors;
	
	public ColorTV(int size, int Colors) {
		super(size);
		this.Colors = Colors;
	}
		public void printProperty() {
	        System.out.println(getSize() + "인치 " + Colors + "컬러");
	    }	

	}	
