
package Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HandlingAutoSuggestionEx2 {

	public void HandlingAutoSuggestionEx2() throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,\"tw\")]")).sendKeys("shoes");
		
		Thread.sleep(1000); 
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]//div"));
		Thread.sleep(1000);
		for(WebElement sugg : allSugg) {
			String Element = sugg.getText();
			if(Element.contains("shoes for girls"))
			{
				sugg.click();
				break;
			}
			System.out.println(sugg.getText());
		}
	}
}
