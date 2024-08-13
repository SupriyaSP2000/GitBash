package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethodsEx {
	
	public static void main(String[] args) {
		
	//launching empty browser
	  WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		
	//method1:- get()--> launch WebApplication
		driver.get("https://www.amazon.com");
		
	//method2:- getTitle()--> fetches the title of webpage
		String title = driver.getTitle();
		System.out.println(title);
		
	//method3:- getCurrentUrl()--> fetches the current url of the webpage
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	//method4:- getPageSource()--> fetches the source code of the webpage
		String source = driver.getPageSource(); 
		//System.out.println(source);
	 
	//method5:- manage()--> maximizing window
	/*	Options opt = driver.manage();
		Window win = opt.window();
		win.maximize(); */
		//or
		driver.manage().window().maximize();
		
	//minimizing window
		//driver.manage().window().minimize();
		
	//zooming the page to fullscreen
		//driver.manage().window().fullscreen();
		
	//method6:- close()--> closes the single tab/window where driver is currently in focus
		//driver.close();
		
	//method7:- quit()--> closes all the tabs/windows including Browser 
		driver.quit();
	}

}
