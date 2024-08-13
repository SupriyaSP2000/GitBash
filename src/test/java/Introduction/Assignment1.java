package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("[name=\"field-keywords\"]")).sendKeys("shoes");
		driver.findElement(By.cssSelector("[id=\"nav-search-submit-button\"]")).click();
	}
}
