package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]")).sendKeys("bluetooth mouse");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		  
		//using syntax 5 --> GroupBy index
		
		  //product name 
		String productName = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).getText(); 
		System.out.println(productName);
		  
		  //product price 
		String productPrice =driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[4]")).getText();
		System.out.println(productPrice);
		 
		 
	}
}
