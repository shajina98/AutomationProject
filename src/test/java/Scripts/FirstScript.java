package Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.Base;

public class FirstScript extends Base {
	
	@Test
	public void scriptMeth() {
		//To maximize the browser
		driver.manage().window().maximize();
		
		// To fetch the title
		System.out.println("Title: "+driver.getTitle());
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		//To click on the Username - name
		driver.findElement(By.name("firstname")).sendKeys("TestUser");
		
		//To click on the Paswd - id
		driver.findElement(By.className("placeholder")).sendKeys("Test@1234");
			

		
		
		
		
		
		//To close the window
		//driver.quit();
		
		
	}
	

}
