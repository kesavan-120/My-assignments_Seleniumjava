package week1day2;

public class Library {
    //passing one argument with string and adding a return statement
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;

	}
    //void means nothing direct print
	public void issueBook() {
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
		//Creating the object for Library class
		Library lb= new Library();
		String bookTitle = lb.addBook("booktitle");
		lb.issueBook();

	}

}
