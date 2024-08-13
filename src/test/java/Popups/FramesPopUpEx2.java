package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesPopUpEx2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topFrame);
		
		WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftFrame);
		
		String left = driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]")).getText();
		System.out.println(left);
		
		driver.switchTo().parentFrame(); //switches the cntrl to the parent of current frame
		WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));

		driver.switchTo().frame(middle);
		String ele = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(ele);

		driver.switchTo().defaultContent(); //swithces the cntrl to the main webpage regardless of no. of frames within the webpage
		WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
			
		driver.switchTo().frame(bottomFrame);

		String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
			System.out.println(bottom);
	}
}
