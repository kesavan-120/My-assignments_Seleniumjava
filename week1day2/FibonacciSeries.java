package week1day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int range1 = 0;
		int range2 = 1;
		System.out.println(range1+""+range2+"");

		for (int i = 2; i <8; i++) {
			int range3 = range1 + range2;
			System.out.println(range3 + "");
			range1 = range2;
			range2 = range3;

		}

	}
}
