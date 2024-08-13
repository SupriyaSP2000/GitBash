package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//1. toLeftOf()
	//	driver.findElement(RelativeLocator.with(By.tagName("input"))
		//		.toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobiles");
		
	//2. toRightOf()
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.toRightOf(By.xpath("(//input[@type=\"text\"])[1]"))).click();
		
		driver.switchTo().alert().accept();  //handling alert
		
	//3. below()
		driver.findElement(RelativeLocator.with(By.tagName("label"))
				.below(By.xpath("//label[text()='Excellent']"))).click();
		
	//4. above()
		driver.findElement(RelativeLocator.with(By.xpath("//input[@type=\"radio\"]"))
				.above(By.xpath("//input[@value=\"2\"]"))).click();
		
	//5. near()
		WebElement ele = driver.findElement(By.xpath("//a[text()='Log in']"));
		//ele.click();
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(ele)).click();

	}
}
