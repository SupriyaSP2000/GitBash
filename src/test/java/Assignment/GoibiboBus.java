package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboBus {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 ewETUe\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()=\"April 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='26']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='May 2024']/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='30']")).click();
	}
}
