package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products...']")).sendKeys("Apples");
		 
		//driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[1]")).sendKeys("Apples");
		
		driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]")).sendKeys("Apples",Keys.ENTER);

		Thread.sleep(2000);
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"break-words h-10 w-full\"]"));
	
		int count=0;
	for (WebElement name : allNames)
	{
		Thread.sleep(2000);
		System.out.println(name.getText());
		count++;
	}
	System.out.println("total num of Apples"+count);
	
	}
}
