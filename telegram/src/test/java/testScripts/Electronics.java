package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class Electronics {
	@Test (invocationCount = 5,threadPoolSize = 6,enabled = false)
	public void register() {
		WebDriver driver=new EdgeDriver();
		System.out.println("Register");
		driver.get("sfdfd");
		driver.quit();	
	}
	
	@Test (invocationCount = 5,threadPoolSize = 6, enabled = false)//(dependsOnMethods = "register")
	
	public void login() {
		WebDriver driver=new EdgeDriver();
		System.out.println("Login");
		driver.quit();	
	}
	
}


