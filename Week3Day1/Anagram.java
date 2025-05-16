package Week3Day1;

public class Anagram {

	public static void main(String[] args) {
		 String text1 = "stops";
	        String text2 = "potss";

	        //Check if the lengths are equal
	        if (text1.length() != text2.length()) {
	            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
	            return;
	        }

	        //Convert strings to character arrays
	        char[] array1 = text1.toCharArray();
	        char[] array2 = text2.toCharArray();

	        // Sort the arrays
	        java.util.Arrays.sort(array1);
	        java.util.Arrays.sort(array2);

	        // Compare sorted arrays
	        boolean isAnagram = true;
	        for (int i = 0; i < array1.length; i++) {
	            if (array1[i] != array2[i]) {
	                isAnagram = false;
	                break;
	            }
	        }

	        // Print
	        if (isAnagram) {
	            System.out.println("The given strings are Anagram.");
	        } else {
	            System.out.println("The given strings are not an Anagram.");
	        }
	    }

	}


