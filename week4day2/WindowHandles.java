package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		// Edgedriver calling
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Entering the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Entering the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click login
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		// Click CRMLink
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		// Click contacts
		driver.findElement(By.linkText("Contacts")).click();
		// Click Merge contacts
		driver.findElement(By.partialLinkText("Merge")).click();
		// Widget of the From contacts
		driver.findElement(By.xpath("//img[@ alt='Lookup']")).click();
		Thread.sleep(3000);
		// Going to switch to childwindow1 so setting up windowhandles setup
		Set<String> windowHandles = driver.getWindowHandles();
		// Converting to set to List for iterative process
		List<String> listwindow = new ArrayList<String>(windowHandles);
		for (int i = 0; i < listwindow.size(); i++) {
			driver.switchTo().window(listwindow.get(i));
			System.out.println(driver.getTitle());
		}
		// switched to childwindow
		driver.switchTo().window(listwindow.get(1));
		//// Taken Advanced xpath using parent child relationship concept with index
		//// based[1]
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		// switch to parent window
		driver.switchTo().window(listwindow.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(3000);
		// Again for switching to childwindow2 create new setup for windowhandles
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listwindow2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listwindow2.get(1));
		// Taken Advanced xpath using parent child relationship concept with index
		// based[2]
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(listwindow.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(3000);
		// To handle Alert popup we initate Alert class
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// Used to get the title of the new page after Alert popup accept
		String title = driver.getTitle();
		System.out.println("Title of the merge is " + title);

	}

}
