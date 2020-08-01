package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;

	By txtusername = By.name("uid");
	By txtpassword = By.name("password");
	By buttonlogin = By.name("btnLogin");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void setTxtUser(String username) {
		
		WebElement txtUser = driver.findElement(txtusername);
		txtUser.sendKeys (username);
	}
	
	public void setPassword(String password) {
		
		WebElement txtPassword = driver.findElement(txtpassword);
		txtPassword.sendKeys (password);
	}
	
	public void clcikLoginButton() {
		
		WebElement BtnLogin = driver.findElement(buttonlogin);
		BtnLogin.click();
	}
	
	public void LoginIntothepage(String user, String pass) {
		
		setTxtUser(user);
		setPassword(pass);
		clcikLoginButton();
		
	}
}