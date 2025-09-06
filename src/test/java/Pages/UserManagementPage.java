package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UserManagementPage {
	
		WebDriver driver;
		
		public UserManagementPage(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements( driver, this);
		}
		
		@FindBy(xpath = "(//span[@class ='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")  
	    WebElement admin_btn;
		
		public void admin() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(admin_btn));
			admin_btn.click();
		}
		
		@FindBy(xpath ="(//input[@class= 'oxd-input oxd-input--active'])[2]")
		WebElement userName;
		
		public void systemUserName(String user_Name) {
			userName.sendKeys(user_Name);
		}
		
		@FindBy(xpath = "//button[@type='submit']")
				WebElement searchBtn;
		
		public void searchUser() {
			searchBtn.click();
			System.out.println("Got userdetails");
		}
		//Testing
		@FindBy(xpath = "(//div[contains(text(),'Admin')])[1]")
		WebElement expectedResult;
		
		public String verify() {
			
			return expectedResult.getText();
		}

}
