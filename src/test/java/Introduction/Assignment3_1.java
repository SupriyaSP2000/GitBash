package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("bluetooth mouse");
		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
		
		String name = driver.findElement(By.xpath("(//a[@class=\"s1Q9rs\"])[1]")).getText();
		System.out.println(name);
		String price = driver.findElement(By.xpath("(//div[@class=\"_30jeq3\"])[1]")).getText();
		System.out.println(price);
	}
}
