package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	By buttonsubmit = By.name("AccSubmit");
	By buttoncontinue = By.xpath("//*[contains(@href,'Customerhomepage')]");
	By buttonSalir = By.xpath("//*[contains(@href,'Logout')]");
	
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
		
		WebElement element = driver.findElement(By.name("accountno"));
		Select cuenta = new Select(element);		
		cuenta.selectByVisibleText("3308");
		
		WebElement BtnSubmit = driver.findElement(buttonsubmit);
		BtnSubmit.click();
		
		WebElement BtnContinue = driver.findElement(buttoncontinue);
		BtnContinue.click();
		
		WebElement BtnSalir = driver.findElement(buttonSalir);
		BtnSalir.click();
						
	}
}