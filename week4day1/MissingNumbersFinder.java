package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumbersFinder {
	    public static void main(String[] args) {
	        // Declare the array
	        int[] array = {1, 2, 3, 4, 10, 6, 8};

	        // Convert array to List
	        List<Integer> numbers = new ArrayList<>();
	        for (int num : array) {
	            numbers.add(num);
	        }

	        // Sort the list in ascending order
	        Collections.sort(numbers);

	        System.out.println("Missing numbers in the sequence:");

	        // Loop through the list and check for missing numbers
	        for (int i = 0; i < numbers.size() - 1; i++) {
	            int current = numbers.get(i);
	            int next = numbers.get(i + 1);

	            // If there's a gap, print all missing numbers between current and next
	            for (int j = current + 1; j < next; j++) {
	                System.out.println(j);
	            }
	        }
	    }
	}


