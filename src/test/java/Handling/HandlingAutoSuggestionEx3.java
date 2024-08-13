package Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionEx3 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("selenium");
		
		Thread.sleep(1000); 
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
		Thread.sleep(1000);
		for(WebElement sugg : allSugg) {
			String Element = sugg.getText();
			if(Element.contains("selenium webdriver"))
			{
				sugg.click();
				break;
			}
			System.out.println(sugg.getText());
		}
	}
}
