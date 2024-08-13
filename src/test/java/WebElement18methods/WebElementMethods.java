package WebElement18methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	//method 1,2,3,4 :- sendKeys(),click(),submit(),clear()
		//WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//searchBar.sendKeys("Puma");
		//searchBar.submit();
		//searchBar.click();
		//searchBar.clear();
		//searchBar.sendKeys("bluetooth");
		
		
	//method 5,6,7 :- getLocation(), getSize(), getRect()
		//WebElement txt = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		
		//System.out.println(txt.getLocation().getX());
		//System.out.println(txt.getLocation().getY());
		
		//System.out.println(txt.getSize().getHeight());
		//System.out.println(txt.getSize().getWidth());
		
		//System.out.println(txt.getRect().getX());
		//System.out.println(txt.getRect().getY());
		//System.out.println(txt.getRect().getHeight());
		//System.out.println(txt.getRect().getWidth());
		
		
	/*
	//method 8:- isDisplayed() 
	    driver.get("https://www.facebook.com"); 
		WebElement facebookLogo = driver.findElement(By.xpath("//img[contains(@class,\"f\")]"));
		  
		if(facebookLogo.isDisplayed()) 
		{ 
			System.out.println("Logo is Dsplayed"); 
		}
		else 
		{ 
			System.out.println("Logo is not Displayed"); 
		}
	
		
	//method 9:- isEnabled() 
		WebElement link = driver.findElement(By.xpath("//a[text()='Create new account']"));
		if(link.isEnabled()) 
		{ 
			link.click(); 
		} 
		else 
		{
		  System.out.println("Element not enabled"); 
		}
		  
	//method 10:- isSelected
	 Thread.sleep(2000); 
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]")); radio.click();
		if(radio.isSelected()) 
		{ 
			System.out.println("radio button is selected"); 
		}
		else 
		{ 
			System.out.println("radio is not selected"); 
		}
		 */
		
	/*	
	//method 11:- getTagName() --> to get htmltag
		WebElement Bar = driver.findElement(By.name("field-keywords"));
		System.out.println(Bar.getTagName());
		
		WebElement link = driver.findElement(By.linkText("Amazon miniTV"));
		System.out.println(link.getTagName());
		
	//method 12:- getAttribute("<AttributeName>") --> to get the attribute value
		System.out.println(link.getAttribute("class"));
		System.out.println(link.getAttribute("href"));
		
	//method 13:- getAriaRole() --> what type of element
		System.out.println(link.getAriaRole());
		System.out.println(Bar.getAriaRole());
		
		WebElement ele = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		System.out.println(ele.getAriaRole());
		*/
		
	//method 14:- DOM:- Document Object Model --> getDomAttribute()
		WebElement txt = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		System.out.println(txt.getDomAttribute("tabindex"));
		
	//method 15:- getDomProperty()
		System.out.println(txt.getDomProperty("baseURI"));
		
	//method 16:- getCssValue()
		WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		System.out.println(searchBar.getCssValue("color"));
		
		System.out.println(searchBar.getCssValue("font-size"));
		
	//method 17:- getAccessibleName()
		WebElement icon = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		System.out.println(icon.getAccessibleName());
		
		WebElement link = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_1\"]"));
		System.out.println(link.getAccessibleName());
		
	//method 18:- getText()
		searchBar.sendKeys("puma");
		searchBar.submit();
		String name = driver.findElement(By.xpath("//span[text()='Unisex-Adult Cat Backpack, Nrgy Blue-Ocean Tropic (9101704)']")).getText();
		System.out.println(name);
	}
}
