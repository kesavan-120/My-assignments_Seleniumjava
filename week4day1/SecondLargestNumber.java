package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
		    public static void main(String[] args) {
		        // Declare the array
		        int[] array = {3, 2, 11, 4, 6, 7};

		        // Convert array to list
		        List<Integer> numbers = new ArrayList<>();
		        for (int num : array) {
		            numbers.add(num);
		        }

		        // Sort the list in ascending order
		        Collections.sort(numbers);

		        // Get second largest number (second last element)
		        int secondLargest = numbers.get(numbers.size() - 2);

		        System.out.println("Second largest number is: " + secondLargest);
		    }
		



}
