package lbspotman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class finalsave {

	
	WebDriver driver;
	 public finalsave(WebDriver driver) {
			this.driver=driver;
		}
	 
	 By savbutton=By.xpath("//button[contains(.,'Save')]");
	 
	 
	 public void clicksave()
	 {
		 driver.findElement(savbutton).click();
	 }
}
