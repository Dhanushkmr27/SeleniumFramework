package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

public class BookTest01 {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomesPage = new WelcomePage(driver);
		
		BooksPage bookspage= new BooksPage(driver);
		
		welcomesPage.getBooksLink().click();
		
		String actualResult=bookspage.getTitleText().getText();
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualResult, "Computers");
		driver.quit();
	
	}
}
