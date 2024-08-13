package Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollByUsingJavaScriptExecutorEx1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //upcasting
		
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
	}
}
