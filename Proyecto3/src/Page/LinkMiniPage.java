package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkMiniPage {
	
	WebDriver driver;
	
	public LinkMiniPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickMiniState() {
			
		WebElement LinkMiniState = driver.findElement(By.partialLinkText("Mini Statement"));
		LinkMiniState.click();
	
	}		

}