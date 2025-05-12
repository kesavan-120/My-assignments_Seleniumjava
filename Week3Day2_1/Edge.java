package Week3Day2;

public class Edge extends Chrome {
	public void takeSnap( ) {
		System.out.println("Takesnap in edge");
	}
	public void clearCookies() {
		System.out.println("Clear cookies in edge");
		
	}
	public static void main(String[] args) {
		Edge ee= new Edge();
		ee.openURL();
		ee.closeBrowser();
		ee.navigateBack();
		ee.openIncognito();
		ee.clearCache();
		ee.takeSnap();
		ee.clearCookies();
		
	}

}
