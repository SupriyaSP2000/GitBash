package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabadiPointsTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.prokabaddi.com/standings");
		
		String teamName = "Jaipur Pink Panthers";
		System.out.println(teamName);
		
		WebElement played = driver.findElement(By.xpath("//p[text()='"+teamName+"']"
				+ "/ancestor::div[@class=\"table-data team\"]/following-sibling::div[@class=\"table-data matches-play\"]"));
		System.out.println(played.getText());
		
		WebElement won = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class=\"table-data team\"]"
				+ "/following-sibling::div[@class=\"table-data matches-won\"]"));
		System.out.println(won.getText());
		
		WebElement lost = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class=\"table-data team\"]"
				+ "/following-sibling::div[@class=\"table-data matches-lost\"]"));
		System.out.println(lost.getText());
		
		WebElement draw = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class=\"table-data team\"]"
				+ "/following-sibling::div[@class=\"table-data matches-draw\"]"));
		System.out.println(draw.getText());
		
		WebElement scoreDiff = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class=\"table-data team\"]"
				+ "/following-sibling::div[@class=\"table-data score-diff\"]"));
		System.out.println(scoreDiff.getText());
		
		WebElement form = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class=\"table-data team\"]"
				+ "/following-sibling::div[@class=\"table-data form\"]"));
		System.out.println(form.getText());
		
		WebElement points = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class=\"table-data team\"]"
				+ "/following-sibling::div[@class=\"table-data points\"]"));
		System.out.println(points.getText());
	}
}
	
