package lbspotman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ZoneConfig {
	WebDriver driver;
	public ZoneConfig(WebDriver driver) {
		this.driver=driver;
	}
	By lprconf=By.xpath("(//div[contains(@class,'v-input--selection-controls__ripple')])[1]");
	By valconf =By.xpath("(//div[contains(@class,'ripple')])[2]");

	
	public void addzoneconfig() throws InterruptedException {
		try {
		    
			Thread.sleep(5000);
			driver.findElement(lprconf).click();
			
			Thread.sleep(5000);
			driver.findElement(valconf).click();
			
			  
		}
		catch(org.openqa.selenium.ElementNotInteractableException ex) {
			Thread.sleep(5000);
			driver.findElement(lprconf).click();
			
			Thread.sleep(5000);
			driver.findElement(valconf).click();
		
		}
		 
	}
}

	


