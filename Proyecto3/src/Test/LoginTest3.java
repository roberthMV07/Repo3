package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.HomePage0;
import Page.LinkMiniPage;
import Page.LoginPage;

public class LoginTest3 {
	
	String driverPath="C:\\Users\\Roberth\\Desktop\\chrome\\chromedriver.exe";
	String url="http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
	WebDriver driver;
	
	LoginPage objLogin;
	HomePage0 objHome;
	LinkMiniPage objLinkMini;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
	
	@Test
	public void Login() {
		
		objLogin = new LoginPage(driver);
		objHome = new HomePage0(driver);
		objLinkMini = new LinkMiniPage(driver);
		
		driver.get(url);
		objLogin.LoginIntothepage("1303", "Guru99");
		Assert.assertEquals("Guru99 Bank Customer HomePage", objHome.GetTitle());
		objLinkMini.clickMiniState();
		
				
	}
}