package lbspotman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class parking {
   
	WebDriver driver;
    
    public parking(WebDriver driver) {
    	this.driver=driver;
    }
    
    By clickaddcard = By.xpath("(//button[@type='button'])[5]");

    public void clickcard() 
    {
	driver.findElement(clickaddcard).click();
    } 
    

}
