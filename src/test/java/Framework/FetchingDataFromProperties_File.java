package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingDataFromProperties_File {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	/* Normal Approach
		 * driver.get("https://www.saucedemo.com/v1/");
	//id()-->syntax:- AttributeName="AttributeValue"
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click();
		 */
		
	//properties_file
	//step1 --> path connection
		//approach 1
		//FileInputStream fis = new FileInputStream("C:\\Users\\SUPRIYA PERIYASAMY\\Desktop\\QSpiders\\Java Selenium\\propertiesData.properties");
		
		//approach2
		FileInputStream fis = new FileInputStream("./propertiesData.properties");
		
		//step2 --> load data into properties class
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
	}
}
