package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertDataToProperties_File {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./propertiesData.properties");//read mode
		Properties pro = new Properties();
		pro.load(fis);
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		FileOutputStream fos = new FileOutputStream("./propertiesData.properties");//write mode
		pro.store(fos, "COMMONDATA");
		
		//Fetching Data
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis1 = new FileInputStream("./propertiesData.properties");
		
		//step2 --> load data into properties class
		Properties pro1 = new Properties();
		pro.load(fis1);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
	}
}
