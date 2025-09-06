package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	    public WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/");
	    }

	    
	}
