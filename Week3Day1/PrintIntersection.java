package Week3Day1;

public class PrintIntersection {

	public static void main(String[] args) {
		// Declaring two arrays a and b
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		// Using nested loop for iteration to compare both arrays declaration

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				// Set conditional statement to compare and print the passed iteration
				if (a[i] == b[j]) {
					System.out.println("Numbers are" + a[i]);

				}
			}

		}

	}

}
