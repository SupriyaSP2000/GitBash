package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindowsHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("bluetooth",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class=\"wjcEIp\"][1]")).click();
		
		String mainId = driver.getWindowHandle();//win1
		//System.out.println(mainId);
		
		Set<String> allIds = driver.getWindowHandles();//win1, win2
		//System.out.println(allIds);
		
		for(String win : allIds)
		{
			if(!mainId.equals(win))
			{
				driver.switchTo().window(win);
				String price = driver.findElement(By.xpath("//div[@class=\"Nx9bqj CxhGGd\"]")).getText();
				System.out.println(price);
			}
		}
	}
}
