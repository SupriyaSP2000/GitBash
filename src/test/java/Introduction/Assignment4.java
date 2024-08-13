package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		
		for (WebElement name : allNames)
		{
			System.out.println(name.getText());
		}
	}
}
