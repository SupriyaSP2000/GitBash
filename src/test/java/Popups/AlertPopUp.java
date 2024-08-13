package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUp {

	//alert popup--> a confirmation popup, until performing any action of this popup,
						//we cant perform other actions in the webpage/elements
		//can't draggable & can't inspectable
	
/* Alert Popup
 It is also called Confirmation popup
 This popups are undraggable
 This popups are uninspectable because they are made of javascript due to this 
 		it is also called as javascript popup.
 As this popup are uninspectable so webdriver cannot handle it directly.
*/
	@Test
	public void AlertPopUp() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();  */
		
	/*	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		String txt = alt.getText();
		System.out.println(txt);  */
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("ThankYou");
		alt.accept();
	}
}
