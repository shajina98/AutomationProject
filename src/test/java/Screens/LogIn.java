package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	public static WebDriver driver;
	
	@FindBy(xpath ="(//div[@class='card-up'])[2]")
	WebElement button;
	
	@FindBy(css = "a#close-fixedban")
	WebElement buttonOne;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnElement() {
		button.click();
	}
	
	public void clickOnButtonOne() {
		buttonOne.click();
	}
	

}
