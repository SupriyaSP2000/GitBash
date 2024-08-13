package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(1000);
		
		WebElement dayList = driver.findElement(By.id("day"));
		Thread.sleep(1000);
		dayList.click();
		
		Select sel = new Select(dayList);
			//syntax1-->selectByIndex
		//sel.selectByIndex(19);
			//syntax2-->SelectByValue
		//sel.selectByValue("24");
			//syntax3-->SelectByVisibleText
		sel.selectByVisibleText("15");
		
		WebElement monList = driver.findElement(By.id("month"));
		Thread.sleep(2000);
		dayList.click();
		
		Select sel1 = new Select(monList);
			//syntax1-->selectByIndex
		//sel1.selectByIndex(1);
			//syntax2-->SelectByValue
		//sel1.selectByValue("11");
			//syntax3-->SelectByVisibleText
		sel1.selectByVisibleText("Jul");
		
		
		WebElement yearList = driver.findElement(By.id("year"));
		Thread.sleep(2000);
		dayList.click();
		
		Select sel2 = new Select(yearList);
			//syntax1-->selectByIndex
		//sel2.selectByIndex(14);
			//syntax2-->selectByValue
		//sel2.selectByValue("1965");
			//syntax3-->SelectByVisibleText
		sel2.selectByVisibleText("1945");
	}
}
