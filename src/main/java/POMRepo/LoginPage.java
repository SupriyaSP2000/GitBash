package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(id="user-name")
	private WebElement UserTextField;
	
	@FindBy(css="[name='password']")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="//input[@class='btn_action']")
	private WebElement LoginButton;

	//getter methods
	public WebElement getUserTextField() {
		return UserTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	//BusinessLogics
	public void loginToApp(String Username, String Password)
	{
		UserTextField.sendKeys(Username);
		PasswordTextField.sendKeys(Password);
		LoginButton.click();
	}
}
