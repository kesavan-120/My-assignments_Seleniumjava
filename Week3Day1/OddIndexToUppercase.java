package Week3Day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if ((i % 2) != 0) {
				System.out.println(Character.toUpperCase(charArray[i]));

			} else {
				System.out.println(charArray[i]);
			}

		}
	}

}
