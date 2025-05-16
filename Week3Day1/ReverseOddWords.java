package Week3Day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		
			  char[] charArray = test.toCharArray();
			  for (int i = charArray.length-1; i>= 0; i--) {
				  System.out.println(charArray[i]);
				
			}
		

	}

}
