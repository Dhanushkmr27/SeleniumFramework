package testScripts;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import ObjectRepository.BooksPage;
import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;

public class BaseClass {

	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void launchBrowser() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/fiction");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		WelcomePage welcomesPage = new WelcomePage(driver);
			
			BooksPage bookpage= new BooksPage(driver);
			
			System.out.println("Before Class");
			}
	
	@BeforeMethod
	public void login(){
		WebDriver driver=new EdgeDriver();
		
		WelcomePage welcomesPage = new WelcomePage(driver);
		
		LoginPage Login=new LoginPage(driver);
		
		welcomesPage.getLoginLink().click();
		
		
		Login.getLoginEmailTextField().sendKeys("dhanushkmr27102003@gmail.com");
		Login.getLoginPasswordTextField().sendKeys("DhanushKmr@27102003");
		
		Login.getLoginButtoninLgPage().click();
		
		System.out.println("Before-method");
		
	}
}
