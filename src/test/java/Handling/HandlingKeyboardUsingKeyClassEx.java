package Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardUsingKeyClassEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			//normal approach
		  //syntax:- AttributeName="AttributeValue"
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@data-test=\"password\"]")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		
		//case2:-
		//driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//Ex2:-
		WebElement UN = driver.findElement(By.id("user-name"));
		UN.sendKeys("standard_user");
		UN.sendKeys(Keys.CONTROL, "a");
		UN.sendKeys(Keys.CONTROL, "c");
		UN.sendKeys(Keys.TAB,Keys.CONTROL, "v");
	}
}
