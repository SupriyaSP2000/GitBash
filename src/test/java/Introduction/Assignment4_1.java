package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		
		for (WebElement name : allNames)
		for (WebElement price : allPrices)
		{
			System.out.println(name.getText());
			System.out.println(price.getText());
		}
	}
}
