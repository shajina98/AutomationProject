package Scripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.Base;
import Screens.LogIn;

public class SecondScript extends Base{

	
	public LogIn login;
	@BeforeTest
	
	public void setUp() {
		login = new LogIn(driver);
	}
	
	
	
	@Test
	public void webTalk(){
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("(//div[@class='card-up'])[2]")).click();
		login.clickOnElement();
		//driver.findElement(By.cssSelector("a#close-fixedban")).click();
		
		login.clickOnButtonOne();
		
		
	

	}

}
