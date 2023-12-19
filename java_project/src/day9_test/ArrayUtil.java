package day9_test;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		// Concatenate arrays a and b
		int[] result = new int[a.length + b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;
	}

	public static void print(int[] a) {
		// Print the elements of array a
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
	}
}
