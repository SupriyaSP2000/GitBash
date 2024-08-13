package SynchronizationHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		

		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 WebElement login = driver.findElement(By.id("login-button"));
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(login));
		 login.click();
		 
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.titleContains("Hello"));
		 
		 driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
		 
	}
}
