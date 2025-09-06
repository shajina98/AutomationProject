package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
		protected WebDriver driver;
		protected String baseUrl;
		
		@BeforeClass
		
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			
			driver.get(baseUrl);//redirecting to the URL
			//driver.navigate().to(baseUrl); //navigating to url
			
			driver.manage().window().maximize();// Maximize the tab/window
			//driver.manage().window().minimize();// minimize the window
			//driver.manage().window().fullscreen(); //full screen
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			System.out.println("URL of the page: "+driver.getCurrentUrl());
			System.out.println("Title: "+driver.getTitle());
			//System.out.println("HTML Page source of page: "+driver.getPageSource());
			//System.out.println("Window handles: "+driver.getWindowHandle());
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			
			
		}
		
		 /*@AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();  // ✅ closes all browser windows and ends WebDriver session
		            System.out.println("Browser closed successfully.");
		        }
		    }*/
		
}
