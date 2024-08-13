package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
				//AND
			//syntax1--> //htmltag[@AttributeName='AttributeValue' and @AttributeName='AttributeValue']
		//driver.findElement(By.xpath("//a[@class=\"nav-a  \" and @data-csa-c-slot-id=\"nav_cs_3\"]")).click();
		
			//syntax2--> //htmltag[@AttributeName='AttributeValue' and text()='visibleText']
		//driver.findElement(By.xpath("//a[@class='nav-a  ' and text()='Best Sellers']")).click();
		
		
				//OR
			//syntax1--> //htmltag[@AttributeName='AttributeValue' and @AttributeName='AttributeValue']
		//driver.findElement(By.xpath("//input[@type='text' or @name='field-keywords']")).sendKeys("Nike");
		
			//syntax2--> //htmltag[@AttributeName='AttributeValue' and contains(text(),'visibleText')]
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav' or contains(text(),'Amazon miniTV')]")).click();	
	}
}
