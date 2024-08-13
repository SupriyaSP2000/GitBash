package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
	//syntax 1:- [AttributeName="AttributeValue"]
		  
	/*	driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[value=\"LOGIN\"]")).click();  */
		 

	//syntax 2:- htmltag[AttributeName="AttributeValue"]
		
	/*	driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[data-test=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[value=\"LOGIN\"]")).click();  */
		
	
	//syntax 3:- supports only id() locator ---> #AttributeValue
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
	//syntax 4:- supports only id() locator ---> htmltag#AttributeValue
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
	//syntax 5:- supports only class() locator ---> .AttributeValue
		//driver.findElement(By.cssSelector(".btn_action")).click();
		
	//syntax 6:- supports only class() locator ---> input.AttributeValue
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

}
