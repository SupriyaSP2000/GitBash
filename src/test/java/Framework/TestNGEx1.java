package Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class TestNGEx1 {

		public void testNGEx1() throws Throwable {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("bluetooth");
			
			Thread.sleep(1000); 
			List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
			Thread.sleep(1000);
			for(WebElement sugg : allSugg)
			{
				String Element = sugg.getText();
				if(Element.contains("bluetooth earphone"))
				{
					sugg.click();
					break;
				}
				System.out.println(sugg.getText());
			}
		}
	}
