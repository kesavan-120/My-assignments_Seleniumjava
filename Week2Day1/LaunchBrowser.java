package Week2Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//For window maximize screen
		driver.manage().window().maximize();
		driver.close();
		
		

	}

}
