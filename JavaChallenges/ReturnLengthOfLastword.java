package JavaChallenges;

public class ReturnLengthOfLastword {
	public static void main(String[] args) {
		//Declare a String "s"
		String s = "Welcome to my planet";
		//Convert to substring with start and end to note the length of the word to print correctly
		String substring = s.substring(14, 20);
		//print the result
		System.out.println("The length of the last word in the String is" + substring);

	}
}
