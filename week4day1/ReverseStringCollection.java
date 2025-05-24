package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollection {
	    public static void main(String[] args) {
	        // Step 1: Declare a String array
	        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	        // Step 2: Add array elements to a List
	        List<String> companyList = new ArrayList<>();
	        for (String company : companies) {
	            companyList.add(company);
	        }

	        // Step 3: Sort the list in ascending order
	        Collections.sort(companyList);

	        // Step 4: Print in reverse order
	        System.out.println("Reversed list:");
	        for (int i = companyList.size() - 1; i >= 0; i--) {
	            System.out.println(companyList.get(i));
	        }
	    }
	

}

