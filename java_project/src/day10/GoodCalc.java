package day10;

public class GoodCalc extends Calculator {

	@Override
	int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	int subattract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	double average(int[] arr) {
		// TODO Auto-generated method stub
		return average(arr);
		
//		return numbers == null || numbers.length == 0 ? 0 : (double) Arrays.stream(numbers).sum() / numbers.length;
//		int[] numbers = {1, 2, 3, 4, 5};
//        double average = calculateAverage(numbers);
		
		
		
		//		int sum = 0;
//		for(i=0; i<arr.length; ) {
//			sum+=arr[i];
//		}
//		
//		for(int v : arr) {
//			sum+= v;
//		}
		
	}

}
