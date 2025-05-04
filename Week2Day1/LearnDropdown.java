package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("Get disabled");
		EdgeDriver driver = new EdgeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		// enter the uname
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// click login
		driver.findElement(By.className("decorativeSubmit")).click();

		// driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cloudrevel innovations");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kesavan");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s = new Select(source);
		s.selectByIndex(2);
		Thread.sleep(2000);

		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select s2 = new Select(marketing);
		s2.selectByVisibleText("Automobile");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select s3 = new Select(ownership);
		s3.selectByValue("OWN_CCORP");

		driver.findElement(By.name("submitButton")).click();

		String title2 = driver.getTitle();
		System.out.println("Current webpage title is STILL TITLE NOT FIXED " + title2);
		driver.close();

	}
}
