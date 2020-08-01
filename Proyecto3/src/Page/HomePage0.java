package Page;

import org.openqa.selenium.WebDriver;

public class HomePage0 {
	
	WebDriver driver;
	
	public HomePage0(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String GetTitle() {
		
		return driver.getTitle();
	}

}