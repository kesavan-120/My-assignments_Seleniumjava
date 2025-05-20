package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindow = new ArrayList<String>(windowHandles);
		for (int i = 0; i < listwindow.size(); i++) {
			driver.switchTo().window(listwindow.get(i));
			System.out.println(driver.getTitle());

		}
		driver.switchTo().window(listwindow.get(0));
		driver.close();

	}
}
