package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	//authentication popup--> the popup which asks for username/password(credentials)
		//cant be draggable
		//cant inspect --> we use URL for handling authentication popup
	
/* Authentication Popup

In real time there will be some websites which will get access after providing username and password.
so the popup which ask for username and password is called as Authentication popup.

This popup are uninspectable so webdriver cannot handle it directly.
without providing authentication.we cannt access the application
 */
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
			//syntax--> https://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
}
