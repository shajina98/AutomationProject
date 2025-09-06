package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.Base;
import Pages.LoginPage;
import Pages.UserManagementPage;

public class LoginTest extends Base{
		SoftAssert softAssertion;
		
		
		
		
		
		@Test(priority =1)

		public void loginTest() {
			LoginPage login = new LoginPage(driver);
			login.userName("Admin");
			login.password("admin123");
			login.clickLoginButton();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			System.out.println("Title after login: " + driver.getTitle());
		    //driver.navigate().refresh();
		    //driver.navigate().back();
		}
		
		@Test(priority =2 , dependsOnMethods = "loginTest")
		public void userManage() {
			softAssertion = new SoftAssert();
			UserManagementPage management = new UserManagementPage(driver);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			management.admin();
			management.systemUserName("Admin");
			management.admin();
			
			//String res = management.verify();
			//String captureOutput = res.getText();
			
			softAssertion.assertEquals("Admin", management.verify());
			softAssertion.assertAll();
			
			
		}
		
}
