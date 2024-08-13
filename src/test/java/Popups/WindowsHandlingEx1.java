package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingEx1 {

/* Window Popup-->

getwindowHandle: It returns only one session id. where driver is currently focusing.
                 The return type is String

getwindowHandles: It returns all browser session id running in execution.
                  The return type is set<String>
	 */
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/ ");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		String mainId = driver.getWindowHandle();//win1
		System.out.println(mainId);
		
		Set<String> allIds = driver.getWindowHandles();//win1, win2
		System.out.println(allIds);
		
		for(String win : allIds)
		{
			if(!mainId.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click();
			}
		}
	}
}
