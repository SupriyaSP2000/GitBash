package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		//AbsoluteXPath --> username
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/input[1]")).sendKeys("standard_user");
		
		//AbsoluteXPath --> password
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/input[2]")).sendKeys("secret_sauce");
		
		//AbsoluteXPath --> login button
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/form/input[3]")).click();
	
	//note---> not preferable
	
	
	}

}
