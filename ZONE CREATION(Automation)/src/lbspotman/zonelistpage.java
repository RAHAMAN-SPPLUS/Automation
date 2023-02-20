package lbspotman;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class zonelistpage {
    WebDriver driver;
    
    public zonelistpage(WebDriver driver) {
    	this.driver=driver;
    }
    
    By search = By.xpath("(//input[contains(@type,'text')])[1]");
    
    public void searchnewzone()throws InterruptedException {
    	try {
    		driver.findElement(search).sendKeys("97918");
    	}
    	catch(org.openqa.selenium.ElementNotInteractableException ex) {
    		driver.findElement(search).sendKeys("97918");
    	}
    }
	
	
}
