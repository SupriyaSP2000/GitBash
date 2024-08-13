package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

	public FlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//method 1 --> findBy
	//@FindBy(xpath="//input[@placeholder=\"Search for Products, Brands and More\"]")

//method 2 --> findBys
	@FindBys({@FindBy(name="q"),@FindBy(xpath="//input[@title='Search for Products, Brands and More']")})
	
	private WebElement SearchTextField;

	
//method 1 --> findBy
	//@FindBy(xpath="//button[@title=\"Search for Products, Brands and More\"]")

//method 3 --> findAll	
	@FindAll({@FindBy(css="[type='submit']"),@FindBy(xpath="//button[@aria-label='Search for Products, Brands and More']")})
	private WebElement SearchIcon;

	
	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	public WebElement getSearchIcon() {
		return SearchIcon;
	}
	
	//BusinessLogics
	public void searchIphone(String text)
	{
		SearchTextField.sendKeys(text);
	}
	public void icon()
	{
		SearchIcon.click();
	}
}
