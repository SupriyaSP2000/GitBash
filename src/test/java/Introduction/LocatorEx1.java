package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorEx1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.name("field-keywords")).sendKeys("puma");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		
//Note--> both LinkText() & PartialLinkText() are only applicable when, 
	//we inspect, an <a></a> should be there and inside <a> tag visible text 
	//should be there and the uniqueness should be there, if not we shld no go for both	
		
	//LinkText()
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		
	//PartialLinkText()
		//driver.findElement(By.partialLinkText("Amazon mi")).click();
		
	//cssSelector()-->syntax:- [AttributeName="AttributeValue"]
		driver.findElement(By.cssSelector("[data-csa-c-content-id=\"nav_cs_mobiles\"]")).click();
		
	}

}
