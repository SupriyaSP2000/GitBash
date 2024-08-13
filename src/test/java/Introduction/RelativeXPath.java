package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//xpath by Attribute() --> syntax:- //htmltag[@AttributeName='AttributeValue']
		//username
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
		//password
		driver.findElement(By.xpath("//input[@data-test=\"password\"]")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
	}
}
