package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		//Click
		driver.findElement(By.linkText("Leads")).click();
		//Click
		driver.findElement(By.partialLinkText("Create")).click();
		//Type firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kesavanrajan");
		//Type lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		//Type company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cloudrevelinnovations");
		//Typetitle
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("OPENTAPS");
		//Click submit
		driver.findElement(By.name("submitButton")).click();
		//verify the title
		String titles = driver.getTitle();
		System.out.println(titles);
		driver.close();
		


	}
}
