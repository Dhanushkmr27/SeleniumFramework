package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

public class BookTest {

@Test
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomesPage = new WelcomePage(driver);
		
		BooksPage bookpage= new BooksPage(driver);
		
		welcomesPage.getBooksLink().click();
		
		
		Select select=new Select(bookpage.getSortByDropDown());
		
				select.selectByIndex(2);
				
				select.selectByIndex(1);
				
				select.selectByIndex(3);
				
}
}