package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Set<String> wins = driver.getWindowHandles();//win1, win2, ...
		
		for(String win : wins)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-pressed=\"true\"]")).click();
	}
}
