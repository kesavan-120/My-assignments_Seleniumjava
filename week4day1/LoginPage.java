package week4day1;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
	System.out.println("Common tasks");
	}
	public static void main(String[] args) {
		//calling basepage methods
		BasePage page= new BasePage();
		page.clickElement();
		page.enterText();
		page.findElement();
		page.performCommonTasks();

		//creating object for childclass-loginpage to call the overridden method
		LoginPage page1= new LoginPage();
		page1.performCommonTasks();
		
	}

}
