package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserdriver {

	

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//For window maximize screen
		driver.manage().window().maximize();
		//Used id locators and used sendkeys for entering the field
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Used id locators and used sendkeys for entering the field
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Used name locators and used .click for clicking the button
		driver.findElement(By.name("login")).click();
		//Used linkText locators for text present in <a> tag href so I used that
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//To get the current title of the webpage First I need to store the title in string and while passing the variable I get the title in console print
		String title = driver.getTitle();
		System.out.println("Title of the current webpage is " + title);
		
		
		
		

	}

}
