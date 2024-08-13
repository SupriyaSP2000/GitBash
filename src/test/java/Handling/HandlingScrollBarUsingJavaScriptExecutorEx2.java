package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Video\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
			//method1:-
		//System.out.println(ele.getLocation().getX());
		//System.out.println(ele.getLocation().getY());
		
		//js.executeScript("window.scrollBy(559,786)");
		//ele.click();
		
			//method2:-
		js.executeScript("arguments[0].scrollIntoView()",ele);
		ele.click();
	}
}
