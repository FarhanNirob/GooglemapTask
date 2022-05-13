package Map;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Map {
	public String baseUrl = "https://www.google.com/maps/";
	String driverPath = "webdriver.chrome.driver\\\", \\\"D:\\\\\\\\SeleniumDriver\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void lunchBrowser() {
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@Test
	public void VerifyingSearchField() {
		
		
	}
}