package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		
		//svg:- scalar vector graphics
		//syntax1:- //*[name()="svg" and @AttributeName="AttributeValue"]
		//syntax2:- //*[name()="svg" and text()="AttributeValue"]
		
		driver.findElement(By.xpath("//*[name()=\"svg\" and @class=\"c8LPF-icon\"]")).click();
	}
}
