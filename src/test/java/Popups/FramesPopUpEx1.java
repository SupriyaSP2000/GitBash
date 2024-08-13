package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUpEx1 {

/* Frame popup--> Frames are most commonly called as iframe
 An inline frame (iframe) is a HTML element that loads another HTML page within the document.
 It essentially puts another webpage within the parent page.
 They are commonly used for advertisements, embedded videos etc.

 */
	
	//1)Handling frames using index--> index value starts from 0
	//2)Handling frames using id() or name() attribute
	//3)Handling frames using WebElements

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
/*	//method 1
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
			
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform(); */
		
		
/*	//method 2
		driver.get("https://demo.automationtesting.in/Frames.html ");
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Qspiders");
	*/
		
	//method 3
		driver.get("https://demo.automationtesting.in/Frames.html ");
		WebElement ele = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
	}
}
