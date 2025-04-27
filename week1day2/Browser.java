package week1day2;

public class Browser {
	//For returntype we should return the string argument and run it
	public String launchbrowser(String browserName) {
		System.out.println("Browser launched sucessfully");
		return browserName;
	}
	//For void there is nothing return happen just run it
	public void loadUrl() {
		System.out.println("Application url loaded sucessfully");
		
	}
	public static void main(String[] args) {
		//For obeject creation this is s syntax Classname referencename = new constructor name();
		//Class name must be same as constructor name
		Browser br= new Browser();
		//For returntype method calling we will be calling method with string denoting in method calling
		String printbrowser = br.launchbrowser("CHROME");
		//For void methoad calling just direct calling needed 
		br.loadUrl();
		
	}
	}
	
	


