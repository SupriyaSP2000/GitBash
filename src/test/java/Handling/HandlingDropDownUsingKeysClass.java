package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(1000);
		
		WebElement dayList = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		dayList.click();
		
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		
		WebElement monthList = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		monthList.click();
		
		monthList.sendKeys(Keys.ARROW_DOWN);
		monthList.sendKeys(Keys.ARROW_DOWN);
		
		
		WebElement yearList = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		yearList.click();
		
		yearList.sendKeys(Keys.ARROW_DOWN);
		yearList.sendKeys(Keys.ARROW_DOWN);
		yearList.sendKeys(Keys.ARROW_DOWN);
		yearList.sendKeys(Keys.ARROW_DOWN);
		yearList.click();
		
	}
}
