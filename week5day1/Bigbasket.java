package week5day1;
 
import java.io.File;

import java.time.Duration;

import java.util.ArrayList;

import java.util.List;

import java.util.Set;

import java.util.logging.FileHandler;
 
import org.openqa.selenium.By;

import org.openqa.selenium.ElementClickInterceptedException;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.google.common.io.Files;
 
import dev.failsafe.internal.util.Assert;
 
public class Bigbasket {
 
	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
 
		// Hover on "Foodgrains, Oil & Masala"
		WebElement foodgrains = driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
		actions.moveToElement(foodgrains).perform();
		Thread.sleep(2000);
 
		// Hover on "Rice & Rice Products"
		WebElement riceProducts = driver.findElement(By.linkText("Rice & Rice Products"));

		actions.moveToElement(riceProducts).perform();
		Thread.sleep(2000);
 
		// Click "Boiled & Steam Rice"
		WebElement boiledRice = driver.findElement(By.linkText("Boiled & Steam Rice"));
		boiledRice.click();
 
		// scrollintoview
		WebElement bbloyalfilter = driver.findElement(By.xpath("//label[contains(text(),'BB Royal')]/preceding-sibling::input"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", bbloyalfilter);
		Thread.sleep(2000);
		bbloyalfilter.click();
		Thread.sleep(2000);
 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")));
        js.executeScript("arguments[0].scrollIntoView(true);", until);
 
		// wait.until(ExpectedConditions.elementToBeClickable(until));
		try {
			until.click();

		} catch (ElementClickInterceptedException e) {
			js.executeScript("arguments[0].click();", until);
		}
 
		String parentwindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> Listwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(Listwindow.get(1));
		Thread.sleep(2000);
 
		WebElement pricetext = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[1]"));
		System.out.println(pricetext.getText());
		Thread.sleep(2000);
		WebElement addtocart = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		addtocart.click();
		WebElement actual = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']"));

		String actual1 = actual.getText();
		System.out.println(actual1);
		String expectedmessage = "An item has been added to your basket successfully";
		if (expectedmessage.equals(actual1)) {

			System.out.println("Verified sucessfully");

		} else {

			System.out.println("Not verified");

		}
 
		// Take screenshot of the currentpage
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("C:\\Users\\KESAVAN R\\eclipse-workspace\\seleniumjava1\\src\\main\\resources\\Screenshot\\screenshots.png"));
 
		// Close the current window
		driver.close();
 
		// close the main window
		driver.quit();
 
	}

}

 