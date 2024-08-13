package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
	//when we launch for the app, get() will wait for all the elements get loaded/displayed
	//get() is preferable
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
	//when we launch app using navigate()--> won't wait for all the elements gets loaded
	//so, navigate() is not preferable(not in use)
		
		//driver.navigate().to("https://www.flipkart.com");
		
		Thread.sleep(1000); // to make the execution slower-->we are getting this func from java 
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
}
