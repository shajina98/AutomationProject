package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest extends BaseTest{
//this class
	

	@Test
    public void homeTitle() {
		System.out.println("Validated");
	}
	public void testLogin() {
        // Now you can use driver directly
        System.out.println("Page Title is: " + driver.getTitle());
    }

}
