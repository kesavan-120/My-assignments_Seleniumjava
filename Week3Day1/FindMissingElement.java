package Week3Day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 8, 6, 7 };

		Arrays.sort(arr);
		for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
			if (i != arr[i - arr[0]]) {
				System.out.println("Missing number: " + i);
				break;

			}
		}
	}

}
