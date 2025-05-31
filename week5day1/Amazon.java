package week5day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;

public class Amazon {

	public static void main(String[] args) throws IOException, Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().refresh();

		// search oneplus
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oneplus 9 pro");
		search.submit();

		// printing the firstproduct price print
		WebElement oneplusprice = driver.findElement(By.xpath("(//span[@class=\"a-price\"])[1]"));
		String text = oneplusprice.getText();
		System.out.println(text);

		// Click using actions
		Actions action = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("(//I[@data-cy=\"reviews-ratings-slot\"])[1]"));
		action.moveToElement(move).click().perform();

		// Firstproduct click
		driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-line-clamp-2 s-link-style a-text-normal\"])[1]")).click();
		
        //Handlewindow
		String parentwindow = driver.getWindowHandle();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> childwindow = new ArrayList<String>(windowhandles);
		driver.switchTo().window(childwindow.get(1));
		Thread.sleep(5000);

		// Click Addtocart
		WebElement cart = driver.findElement(By.xpath("(//input[@value=\"Add to Cart\"])[2]"));
		cart.click();
		Thread.sleep(5000);

		// Save the screenshot in src/main/resources
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("C:\\Users\\KESAVAN R\\eclipse-workspace\\seleniumjava1\\src\\main\\resources\\Screenshot\\amazonscreenshot.png"));

		// Verify cart subtotal
		WebElement subtotalexpected = driver.findElement(By.xpath("(//span[text()='10,999'])[1]"));
		System.out.println(subtotalexpected.getText());
		String actual = "10,999";

		if (actual.equals(subtotalexpected)) {
			System.out.println("SubTotal is verfied sucessfully");
		}
		else {
			System.out.println("Not verfied");

		}

		// close the browser
		driver.quit();

	}

}
