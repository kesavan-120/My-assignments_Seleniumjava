package week4day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ListInterface {
	public static void main(String[] args) throws Throwable {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		WebElement enter= driver.findElement(By.className("desktop-searchBar"));
		enter.sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='Men']")).click();
	    WebElement laptopcount= driver.findElement(By.xpath("//label[text()='Laptop Bag']"));
	    laptopcount.click();
	    WebElement size= driver.findElement(By.xpath("//span[@class='title-count']"));
	    System.out.println(size);
	    
	    List<String> list= new ArrayList<String>();
	    WebElement getalltext= driver.findElement(By.xpath("//ul[@class='results-base']"));
	    System.out.println(getalltext.getText());
	   
	}




}
