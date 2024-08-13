package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	//FileUpload Popup--> used to upload files in webpages
	
/* FileUpload popup --> The seperate window which comes for selecting the file 
 								which need to be upload is called file upload.
 */
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\SUPRIYA PERIYASAMY\\Desktop\\QSpiders\\Java Selenium\\JAVA_SELENIUM_notes\\1_CourseContent.txt");
		
		driver.findElement(By.id("file-submit")).click();
	}
}
