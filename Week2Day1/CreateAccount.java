package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		//LAUNCH EDGEBROWSER
		EdgeDriver driver = new EdgeDriver();
		//LOAD URL
		driver.get("http://leaftaps.com/opentaps/.");
		//MAXIMIZE
		driver.manage().window().maximize();
		//TYPE USERNAME
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//TYPE PASSWORD
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//CLICK
		driver.findElement(By.className("decorativeSubmit")).click();
		//CLICK THE LINK
		driver.findElement(By.partialLinkText("CRM")).click();
		//CLICK
		driver.findElement(By.linkText("Accounts")).click();
		//CLICK
		driver.findElement(By.partialLinkText("Create")).click();
		//TYPE ACCOUNT NAME
		driver.findElement(By.id("accountName")).sendKeys("Kesavanrajan");
		//TYPE DESCRIPTION
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//ENTER THE NO OF EMP
		driver.findElement(By.id("numberEmployees")).sendKeys("65");
		//TYPE OFFICESITES
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//CLICK CREATE ACCOUNT
		driver.findElement(By.className("smallSubmit")).click();
		//GET THE TITLE OF THE CURRENT WEBPAGE BY STORING IN STRING
		String title = driver.getTitle();
		System.out.println("Current title of this webpage is OPENTAPS" + title);
		//CLOSE THE DRIVER
		driver.close();
	}

}
