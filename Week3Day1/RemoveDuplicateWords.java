package Week3Day1;

public class RemoveDuplicateWords {
public static void main(String[] args) {
	String text = "We learn Java basics as part of java sessions in java week1";

    //Initialize count
    int count = 0;

    //Split text into words
    String[] words = text.split(" ");

    // Compare each word with every other word
    for (int i = 0; i < words.length; i++) {
        // Skip already removed words
        if (words[i].equals("")) {
            continue;
        }

        for (int j = i + 1; j < words.length; j++) {
            // If words match (case-insensitive)
            if (words[i].equalsIgnoreCase(words[j])) {
                words[j] = ""; // Remove duplicate
                count++;       // Increase count
            }
        }
    }

    if (count > 0) {
        System.out.println("Sentence after removing duplicates:");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                System.out.print(words[i] + " ");
            }
        }
    } else {
        System.out.println("No duplicates found.");
    }
}
}

