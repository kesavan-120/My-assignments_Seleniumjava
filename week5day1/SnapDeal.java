package week5day1;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SnapDeal {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// mouseover mens wear
		WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));

		Actions action = new Actions(driver);
		action.moveToElement(mens).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sports Shoes")).click();

		// scroll to bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,5000);");
		Thread.sleep(10000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,7500);");
		Thread.sleep(5000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,10000);");

		Thread.sleep(5000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,13500);");
		Thread.sleep(5000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,15000);");
		Thread.sleep(5000);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0);");
		Thread.sleep(5000);

		// sportsShoe count
		List<WebElement> sportsShoecount = driver
				.findElements(By.xpath("//div[@class=\"col-xs-6  favDp product-tuple-listing js-tuple \"]"));
		System.out.println(sportsShoecount.size());

		// click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// click sortby
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		Thread.sleep(2000);

		// click price low to high
		driver.findElement(By.xpath("//ul[@class='sort-value']//li[2]")).click();

		// Check if the displayed items are sorted correctly.but I dont know how to
		// check sorted items displayed correctly
//		 List<WebElement> sortedproducts = driver.findElements(By.xpath("//img[@class='product-image wooble']"));
//		
//	     JavascriptExecutor js8 = (JavascriptExecutor) driver;
//	     js.executeScript("window.scrollTo(0,15000);");
//	     Thread.sleep(5000);
//	     
//	     JavascriptExecutor js9 = (JavascriptExecutor) driver;
//	     js.executeScript("window.scrollTo(0,0);");
//	     Thread.sleep(5000);
//		
		// list the actual products
//		 List<String> actualproduct= new ArrayList<String>();
//	     
//		 for (WebElement element : sortedproducts) {
//			 actualproduct.add(element.getText().trim());
//			
//			//list the sorted products
//			
//			 List<String> sorted = new ArrayList<String>();
//			 Collections.sort(sorted);
//			
//		 if (actualproduct.equals(sorted)) {
//			 System.out.println("Items are sorted correctly");
//		 }	
//		 else {
//			System.out.println("Not sorted");
//		}
		WebElement start = driver.findElement(By.name("fromVal"));
		WebElement end = driver.findElement(By.name("toVal"));

		JavascriptExecutor jb = (JavascriptExecutor) driver;
		jb.executeScript("arguments[0].scrollIntoView(true);", start);
		start.clear();
		start.sendKeys("550");

		end.clear();
		end.sendKeys("700");

		// click blackcolour in filter
		WebElement blackcolour = driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
		blackcolour.click();
		System.out.println(blackcolour.getText());

		// Filtered black coloured
		WebElement blackfilter = driver.findElement(By.xpath("(//a[text()='Black'])[1]"));
		System.out.println(blackfilter.getText());
		Thread.sleep(2000);

		// checking filtered products corrrectly or not
		if (blackfilter.isDisplayed()) {
			System.out.println("Black colour filter displayed");
		} else {
			System.out.println("Not filtered");
		}
		// Mouseover
		WebElement quick = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions act = new Actions(driver);
		act.moveToElement(quick).perform();

		// Clicking quickview
		WebElement quickview = driver.findElement(By.xpath("//div[contains(text(),'Quick')]"));
		quickview.click();
		Thread.sleep(3000);

		// print amount
		WebElement amount = driver.findElement(By.xpath("//span[@class=\"payBlkBig\"]"));
		System.out.println(amount.getText());
		Thread.sleep(3000);
		// System.out.println("test");

		// Save the screenshot in src/main/resources //I dont know how to take
		// screenshot specifically for shoes
		File screen = ((TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		Files.copy(screen, new File(
				"C:\\Users\\KESAVAN R\\eclipse-workspace\\seleniumjava1\\src\\main\\resources\\Screenshot\\screenshots.png"));
		Thread.sleep(2000);
		// closing the current window
		driver.close();
		// Closing the main window I dont have any iframe here
		driver.quit();
	}

}
