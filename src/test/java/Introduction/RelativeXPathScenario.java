package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathScenario {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		//Flipkart:-
			//xpath by Attribute()
		//syntax1 --> //htmltag[@AttributeName="AttributeValue"]
	//driver.findElement(By.xpath("//img[@alt=\"Grocery\"]")).click();
		
			//xpath by text()
		//syntax2 --> //htmltag[text()="AttributeValue"]
	//driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click();
		
		
		
		//Amazon:-
			//xpath by contains Attribute()
		//syntax3 --> //htmltag[contains(@AttributeName,"AttributeValue")]
	driver.findElement(By.xpath("//input[contains(@id,\"tw\")]")).sendKeys("shoes");
	driver.findElement(By.xpath("//input[contains(@id,\"nav\")]")).click();
	
			//xpath by contains text()
		//syntax4 --> //htmltag[contains(text(),"AttributeValue")]
	driver.findElement(By.xpath("//span[contains(text(),\"Memory Foam Me\")]")).click();
	}
}
