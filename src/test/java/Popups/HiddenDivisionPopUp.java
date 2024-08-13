package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

/* Hidden Division PopUp --> The screen which comes in webpage after some 
    							//specific action is consider as Hidden Division PopUp
		This popups are Undraggable
		This Popups are inspectable means it can handle by webdriver directly 
		This is made by HTML Lang
	Ex:-Calender pop
 */
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
	}
}
