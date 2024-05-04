package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(id = "Email")
	private WebElement LoginEmailTextField;
	
	@FindBy(id = "Password")
	private WebElement LoginPasswordTextField;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement LoginButtoninLgPage;
	
	public WebElement getloginLink() {
		return LoginLink;
	}
	
	public WebElement getLoginEmailTextField() {
		return LoginEmailTextField; 
	
	}
	
	public WebElement getLoginPasswordTextField() {
		return LoginPasswordTextField;
		
	}
	
	public WebElement getLoginButtoninLgPage() {
		return LoginButtoninLgPage;
	}

}
    

