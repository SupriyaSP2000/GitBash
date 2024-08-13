package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PomImp {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//properties_file
		//step1 --> path connection
		//approach 1
		//FileInputStream fis = new FileInputStream("C:\\Users\\SUPRIYA PERIYASAMY\\Desktop\\QSpiders\\Java Selenium\\propertiesData.properties");
		
		//approach2
		FileInputStream fis = new FileInputStream("./propertiesData.properties");
		
		//step2 --> load data into properties class
		Properties pro = new Properties();
		pro.load(fis);
		//step3 --> reading the data using getProperty("Key")
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		
	/*	//1) normal approach
	 	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
	*/	
		
	/*	//2) Implementing using POM class
		LoginPage login = new LoginPage(driver);
		login.getUserTextField().sendKeys(USERNAME);
		login.getPasswordTextField().sendKeys(PASSWORD);
		login.getLoginButton().click();
	*/
		
		//3) Implementing using POM class by creating own method
		LoginPage login = new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
	}
}
