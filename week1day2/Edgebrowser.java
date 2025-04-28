package week1day2;

public class Edgebrowser {
	public static void main(String[] args) {
		//New object created for Edgebrowser class
		Browser ba= new Browser();
		//After creating the object calling the launchbrowser method with printing "Edge"
		System.out.println(ba.launchbrowser("Edge"));
		//Calling loadurl methoad from browser class
		ba.loadUrl();
	}

}
