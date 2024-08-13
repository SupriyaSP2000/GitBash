package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.FlipkartPage;
import POMRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPomImp {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//step1 --> path connection
		FileInputStream fis = new FileInputStream("C:\\Users\\SUPRIYA PERIYASAMY\\Desktop\\QSpiders\\Java Selenium\\FlipkartData.properties");
		
		//step2 --> load data into properties class
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String ITEM = pro.getProperty("item");
		driver.get(URL);
	
		//Implementing using POM class by creating own method
		FlipkartPage search = new FlipkartPage(driver);
		search.searchIphone(ITEM);
		search.icon();
	}
}
