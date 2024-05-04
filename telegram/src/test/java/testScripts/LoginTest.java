package testScripts;
import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;


public class LoginTest {
	@Test
public static void main (String [] args) {
	
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		LoginPage Loginpage=new LoginPage(driver);
		
		Loginpage.getloginLink().click();
		
		Loginpage.getLoginEmailTextField().sendKeys("dhanushkmr27102003@gmail.com");
		
		Loginpage.getLoginPasswordTextField().sendKeys("Dhanushkmr@27102003");
		
		Loginpage.getLoginButtoninLgPage().click();
		
		
		
	}
		
		
		
		
		
}