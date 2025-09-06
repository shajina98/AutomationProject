package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement user_Name;
	
	public void userName(String userName) {
		user_Name.sendKeys(userName);
	}
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass_word;
	
	public void password(String password) {
		pass_word.sendKeys(password);
	}
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement login_button;
	
	public void clickLoginButton() {
		login_button.click();
	}
	

}
