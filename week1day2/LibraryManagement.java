package week1day2;

public class LibraryManagement {
	public static void main(String[] args) {
		//Creating object for the Library class in the main method of LibraryManagement.
		Library lm= new Library();
		System.out.println(lm.addBook("Books"));
		lm.issueBook();
	}

}
