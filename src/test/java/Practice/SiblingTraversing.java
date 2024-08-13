package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingTraversing {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/"); 
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		////input[@placeholder="Username"]/following-sibling::input[@placeholder="Password"]
		
		
		 driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Iphone"); 
		 driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
	
		
	/*	 //div[text()="Apple iPhone 15 (Blue, 128 GB)"]/../following-sibling::div/div/div/div[text()="₹65,999"] 
		 or
		 //div[text()="Apple iPhone 15 (Blue, 128 GB)"]/../following-sibling::div//div[text()="₹65,999"]
	*/
		
		}
}
