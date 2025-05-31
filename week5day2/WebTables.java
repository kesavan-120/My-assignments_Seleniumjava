package week5day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();

		WebElement mouseover = driver.findElement(By.xpath("(//button[@aria-label='More'])[1]"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(mouseover).perform();

		WebElement cryptoclick = driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"));
		cryptoclick.click();
        
		//Table
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']"));
		System.out.println(table.size());
        
		//TotalRow
		List<WebElement> rowscount = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tr"));
		System.out.println(rowscount.size());

		//Totalcolumn
		List<WebElement> colcount = driver.findElements(By.xpath("//table[@class='yf-1570k0a bd']/tbody/tr/td"));
		System.out.println(colcount.size());
        
		//Retrieve for Total row
		for (int i = 1; i < rowscount.size(); i++) {
		WebElement rowcount1 = driver.findElement(By.xpath("//table[@class='yf-1570k0a bd']/tr[" + i + "]/td"));
		System.out.println(rowcount1.getText());
        //	//Retrieve for Total column
		for (int j = 1; j < colcount.size(); j++) {
		WebElement colcount1 = driver.findElement(By.xpath("//table[@class='yf-1570k0a bd']/tr[" + i + "]/td[" + j + "]"));
		System.out.println(colcount1.getText());

			}

		}
	}

}
